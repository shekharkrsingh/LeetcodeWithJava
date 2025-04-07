class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums)
            sum += num;
        if (sum % 2 != 0)
            return false;
        sum = sum / 2;
        int[][] dp = new int[n][sum + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return canPartitionSubset(n - 1, sum, nums, dp);
    }

    private boolean canPartitionSubset(int idx, int sum, int[] nums, int[][] dp) {
        if (sum == 0)
            return true;
        if (idx < 0)
            return false;
        if (dp[idx][sum] != -1)
            return dp[idx][sum] == 1;
        boolean include = false;
        if (nums[idx] <= sum)
            include = canPartitionSubset(idx - 1, sum - nums[idx], nums, dp);
        boolean exclude = canPartitionSubset(idx - 1, sum, nums, dp);
        dp[idx][sum] = (include || exclude) ? 1 : 0;
        return dp[idx][sum] == 1;
    }
}
