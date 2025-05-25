class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        int n = nums.length;
        int right = 0;
        int left = 0;
        long ans = 0;
        while (right < n - 1) {
            if (nums[right] != nums[right + 1])
                right++;
            else {
                left = right + 1;
                right++;
            }
            ans += right - left + 1;
        }
        return ans + 1;
    }
}