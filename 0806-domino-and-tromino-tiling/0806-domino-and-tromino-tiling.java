class Solution {
    private static int MOD = 1_000_000_007;

    public int numTilings(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return sol(n, dp);
    }

    private int sol(int n, int[] dp) {
        if (dp[n] != -1)
            return dp[n];
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 5;
        long total = 2 * sol(n - 1, dp) % MOD + sol(n - 3, dp) % MOD;
        dp[n] = (int) total % MOD;
        return dp[n];
    }
}