class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 0; i <= amount; i++)
            dp[i] = -1;
        int result = calculateCoinChange(coins, amount, dp);
        return (result == Integer.MAX_VALUE - 1) ? -1 : result;
    }

    private int calculateCoinChange(int[] coins, int amount, int[] dp) {
        if (amount == 0)
            return 0;
        if (amount < 0)
            return Integer.MAX_VALUE - 1;
        if (dp[amount] != -1)
            return dp[amount];
        int minValue = Integer.MAX_VALUE - 1;
        for (int c : coins)
            minValue = Math.min(calculateCoinChange(coins, amount - c, dp) + 1, minValue);
        dp[amount] = minValue;
        return minValue;
    }
}