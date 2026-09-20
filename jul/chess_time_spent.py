#!/usr/bin/env python3
"""Total the elapsed time spent playing Rapid, Blitz, and Bullet on Chess.com.

Uses Chess.com's public archive API.  A game's duration is the wall-clock time
between its PGN StartTime and EndTime, which includes both players' turns.
"""

from __future__ import annotations

import argparse
import json
import re
import sys
from collections import defaultdict
from datetime import datetime, timezone
from typing import Any
from urllib.error import HTTPError, URLError
from urllib.request import Request, urlopen


API_ROOT = "https://api.chess.com/pub/player"
TIME_CLASSES = ("rapid", "blitz", "bullet")
HEADERS = {"User-Agent": "chess-time-spent/1.0 (public Chess.com API client)"}
PGN_TAG = re.compile(r'^\[(\w+)\s+"([^"]*)"\]$', re.MULTILINE)


def fetch_json(url: str) -> dict[str, Any]:
    """Request one JSON API resource and turn network errors into useful text."""
    request = Request(url, headers=HEADERS)
    try:
        with urlopen(request, timeout=30) as response:
            return json.load(response)
    except HTTPError as error:
        if error.code == 404:
            raise RuntimeError("Chess.com could not find that username.") from error
        raise RuntimeError(f"Chess.com API returned HTTP {error.code} for {url}") from error
    except URLError as error:
        raise RuntimeError(f"Could not reach Chess.com: {error.reason}") from error


def pgn_duration_seconds(pgn: str) -> int | None:
    """Return elapsed seconds from the UTC timestamp tags in one PGN game."""
    tags = dict(PGN_TAG.findall(pgn))
    start_date = tags.get("UTCDate") or tags.get("Date")
    end_date = tags.get("EndDate") or start_date
    start_time = tags.get("StartTime") or tags.get("UTCTime")
    end_time = tags.get("EndTime")

    if not all((start_date, end_date, start_time, end_time)):
        return None

    try:
        started = datetime.strptime(
            f"{start_date} {start_time}", "%Y.%m.%d %H:%M:%S"
        ).replace(tzinfo=timezone.utc)
        ended = datetime.strptime(
            f"{end_date} {end_time}", "%Y.%m.%d %H:%M:%S"
        ).replace(tzinfo=timezone.utc)
    except ValueError:
        return None

    seconds = int((ended - started).total_seconds())
    return seconds if seconds >= 0 else None


def format_duration(seconds: int) -> str:
    hours, remainder = divmod(seconds, 3600)
    minutes, seconds = divmod(remainder, 60)
    return f"{hours:,}h {minutes:02}m {seconds:02}s"


def calculate(
    username: str, quiet: bool = False
) -> tuple[dict[str, int], dict[str, int], dict[str, int]]:
    archives_url = f"{API_ROOT}/{username}/games/archives"
    archives = fetch_json(archives_url).get("archives", [])
    totals: dict[str, int] = defaultdict(int)
    games: dict[str, int] = defaultdict(int)
    missing: dict[str, int] = defaultdict(int)

    for index, archive_url in enumerate(archives, start=1):
        if not quiet:
            print(f"Downloading archive {index}/{len(archives)}...", end="\r", flush=True)
        for game in fetch_json(archive_url).get("games", []):
            time_class = game.get("time_class", "").lower()
            if time_class not in TIME_CLASSES:
                continue
            games[time_class] += 1
            duration = pgn_duration_seconds(game.get("pgn", ""))
            if duration is None:
                missing[time_class] += 1
            else:
                totals[time_class] += duration

    if not quiet and archives:
        print(" " * 60, end="\r")
    return totals, {key: games[key] for key in TIME_CLASSES}, {key: missing[key] for key in TIME_CLASSES}


def main() -> int:
    parser = argparse.ArgumentParser(
        description="Total elapsed Rapid, Blitz, and Bullet game time from Chess.com archives."
    )
    parser.add_argument("username", nargs="?", help="Chess.com username")
    parser.add_argument("--quiet", action="store_true", help="Do not show download progress")
    args = parser.parse_args()

    username = (args.username or input("Chess.com username: ")).strip()
    if not username:
        print("A Chess.com username is required.", file=sys.stderr)
        return 2

    try:
        totals, games, missing = calculate(username, args.quiet)
    except RuntimeError as error:
        print(f"Error: {error}", file=sys.stderr)
        return 1

    print(f"\nChess.com time for {username}")
    print("=" * (20 + len(username)))
    for time_class in TIME_CLASSES:
        label = time_class.capitalize()
        print(f"{label:<7} {format_duration(totals[time_class]):>16}  ({games[time_class]:,} games)")
        if missing[time_class]:
            print(f"        {missing[time_class]:,} game(s) excluded: no usable PGN timestamps")

    total_seconds = sum(totals.values())
    total_games = sum(games.values())
    print(f"{'Total':<7} {format_duration(total_seconds):>16}  ({total_games:,} games)")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
