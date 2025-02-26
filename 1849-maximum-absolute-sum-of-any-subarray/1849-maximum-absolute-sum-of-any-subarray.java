class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int currentMaxSum = 0;
        int currentMinSum = 0;
        for (int num : nums) {
            currentMaxSum += num;
            currentMinSum += num;
            maxSum = Math.max(maxSum, currentMaxSum);
            minSum = Math.min(minSum, currentMinSum);
            if (currentMaxSum < 0)
                currentMaxSum = 0;
            if (currentMinSum > 0)
                currentMinSum = 0;
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}
