class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        int[] dp = new int[size];
        Arrays.fill(dp, -1);
        dp[0] = cost[0];
        dp[1] = cost[1];
        return Math.min(
                implementMinCostClimbingStairs(cost, size - 2, dp),
                implementMinCostClimbingStairs(cost, size - 1, dp));
    }

    private int implementMinCostClimbingStairs(int[] cost, int idx, int[] dp) {
        if (dp[idx] != -1)
            return dp[idx];
        dp[idx] = Math.min(
                implementMinCostClimbingStairs(cost, idx - 2, dp),
                implementMinCostClimbingStairs(cost, idx - 1, dp)) + cost[idx];
        return dp[idx];
    }

}