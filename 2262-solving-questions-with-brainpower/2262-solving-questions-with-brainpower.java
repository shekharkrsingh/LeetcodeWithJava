class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        Arrays.fill(dp, -1);
        return sol(0, questions, dp);
    }

    private long sol(int idx, int[][] questions, long[] dp) {
        if (idx >= questions.length)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];
        long notTake = sol(idx + 1, questions, dp);
        long take = sol(idx + questions[idx][1] + 1, questions, dp) + questions[idx][0];
        dp[idx] = Math.max(take, notTake);
        return dp[idx];
    }
}