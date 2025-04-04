class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        int[][] dp = new int[n + 1][n + 1];
        Arrays.sort(satisfaction);
        for (int i = 0; i < n + 1; i++)
            for (int j = 0; j < n + 1; j++)
                dp[i][j] = -1;
        return sol(0, 1, satisfaction, dp, n);
    }

    private int sol(int idx, int time, int[] sat, int[][] dp, int n) {
        if (idx == n)
            return 0;
        if (dp[idx][time] != -1)
            return dp[idx][time];
        int take = sol(idx + 1, time + 1, sat, dp, n);
        int notTake = sol(idx + 1, time, sat, dp, n);
        int result = Math.max(take + (time * sat[idx]), notTake);
        dp[idx][time] = result;
        return result;
    }
}