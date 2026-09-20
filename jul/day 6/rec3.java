import java.util.Arrays;
import java.util.Scanner;

public class Rec2 {

    static long[] dp = new long[100];

    static long fibonacci(long n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = fibonacci(n - 1) + fibonacci(n - 2);

        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Arrays.fill(dp, -1);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}