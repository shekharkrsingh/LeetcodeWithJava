class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int maxVal = 0;
        for(int it: nums)
            maxVal = Math.max(maxVal, it);
        int start = 0;
        int maxCount = 0;
        long count = 0;
        for (int end = 0; end < n; end++) {
            if (nums[end] == maxVal)
                maxCount++;
            while (maxCount >= k) {
                count += (n - end);
                if (nums[start] == maxVal)
                    maxCount--;
                start++;
            }
        }
        return count;
    }
}
