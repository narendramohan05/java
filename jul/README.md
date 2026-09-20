# Chess.com Time Spent

`chess_time_spent.py` totals the elapsed wall-clock duration of every Rapid,
Blitz, and Bullet game in a public Chess.com account archive.

Run it with Python 3.10 or newer; no packages need to be installed:

```powershell
python chess_time_spent.py hikaru
```

Or run it without an argument and enter the username when prompted:

```powershell
python chess_time_spent.py
```

The tool gets the list of monthly archives from Chess.com's public API, then
checks every game. It uses the PGN's UTC start and end timestamps, so each
game's duration reflects real elapsed play time, including both players'
turns. A game with missing or invalid timestamps is not estimated and is shown
as excluded in the result.
