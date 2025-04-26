class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int leftBound = -1;
        int lastMin = -1;
        int lastMax = -1;
        long ans = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] >= minK && nums[i] <= maxK) {
                if (nums[i] == minK)
                    lastMin = i;
                if (nums[i] == maxK)
                    lastMax = i;
                ans += Math.max(0, Math.min(lastMin, lastMax) - leftBound);
            } else {
                leftBound = i;
                lastMin = -1;
                lastMax = -1;
            }
        return ans;
    }
}