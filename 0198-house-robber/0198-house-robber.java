class Solution {
    public int rob(int[] nums) {
        int size=nums.length;
        int[] dp=new int[size+1];
        Arrays.fill(dp, -1);
        return Math.max(
            implement(nums, size-1, dp),
            implement(nums, size-2, dp)
        );
    }

    private int implement(int[] nums, int idx, int[] dp){
        if(idx<0)
        return 0;
        if(dp[idx]!=-1) return dp[idx];
        dp[idx]= Math.max(
            implement(nums, idx-2, dp),
            implement(nums, idx-3, dp)
        )+nums[idx];
        return dp[idx];
    }
}