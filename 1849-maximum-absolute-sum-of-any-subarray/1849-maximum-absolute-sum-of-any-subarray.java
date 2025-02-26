class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int pSum = 0;
        int nSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            pSum += nums[i];
            nSum += nums[i];
            maxSum = Math.max(maxSum, pSum);
            minSum = Math.min(minSum, nSum);
            if (pSum < 0)
                pSum = 0;
            if (nSum > 0)
                nSum = 0;
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}