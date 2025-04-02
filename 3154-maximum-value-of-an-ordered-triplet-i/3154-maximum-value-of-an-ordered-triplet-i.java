class Solution {
    public long maximumTripletValue(int[] nums) {
        int preMax = nums[0];
        long maxVal = 0;
        long maxResult = 0;
        int n = nums.length;
        int[] postMax = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            maxVal = Math.max(maxVal, nums[i]);
            postMax[i] = (int)maxVal;
        }
        maxVal = nums[0];
        for (int i = 1; i < n-1; i++) {
            long res=(maxVal - nums[i]) * postMax[i+1];
            maxResult = maxResult> res? maxResult: res;
            maxVal = Math.max(maxVal, nums[i]);
        }
        return maxResult;
    }
}