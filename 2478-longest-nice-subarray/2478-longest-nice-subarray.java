class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        int orValue = 0;
        int left = 0;
        int right;
        for (right=0; right < n; right++) {
            while ((orValue & nums[right]) != 0) {
                orValue ^= nums[left];
                left++;
            }
            orValue |= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}