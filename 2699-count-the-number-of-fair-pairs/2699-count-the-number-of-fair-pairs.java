class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums, upper) - countPairs(nums, lower - 1);
    }

    public static long countPairs(int[] nums, int target) {
        long count = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int ans = nums[left] + nums[right];
            if (ans <= target) {
                count += (right - left);
                left++;
            } else
                right--;
        }
        return count;
    }
}