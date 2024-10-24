import java.util.Scanner;

public class LegoWall1 {

    private static final int MOD = 1000000007;

    public static long legoWall(int n, int m) {
        // DP array to hold the number of ways to build walls of width 0 to m
        long[] dp = new long[m + 1];

        // Base cases
        dp[0] = 1; // 1 way to build width 0 (no bricks)
        if (m >= 1) {
            dp[1] = 1; // 1 way to build width 1 (1x1 brick)
        }
        if (m >= 2) {
            dp[2] = 2; // 2 ways to build width 2
        }
        if (m >= 3) {
            dp[3] = 4; // 4 ways to build width 3
        }
        if (m >= 4) {
            dp[4] = 8; // 8 ways to build width 4
        }

        // Fill dp array for widths from 5 to m
        for (int i = 5; i <= m; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4]) % MOD;
        }

        // Total ways to build the wall of height n and width m
        long totalWays = 1;
        for (int i = 0; i < n; i++) {
            totalWays = (totalWays * dp[m]) % MOD;
        }

        return totalWays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read height and width from input
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Calculate and print the number of ways to build the wall
        long result = legoWall(n, m);
        System.out.println(result);

        scanner.close();
    }
}
