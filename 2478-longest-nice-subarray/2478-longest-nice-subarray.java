class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int xorValue = 0;
        int maxLen = 0;
        int first = 0;
        int second = 0;
        while (second != n) {
            sum += nums[second];
            xorValue ^= nums[second];
            while (sum != xorValue) {
                sum -= nums[first];
                xorValue ^= nums[first];
                first++;
            }
            maxLen = Math.max(maxLen, second - first + 1);
            second++;
        }
        return maxLen;
    }
}