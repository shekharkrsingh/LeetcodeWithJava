class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        int size = coins.length;
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int minVal = Integer.MAX_VALUE - 1;
            for (int j = 0; j < size; j++) {
                if (i - coins[j] >= 0)
                    minVal = Math.min(dp[i - coins[j]], minVal);
            }
            dp[i] = minVal + 1;
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}