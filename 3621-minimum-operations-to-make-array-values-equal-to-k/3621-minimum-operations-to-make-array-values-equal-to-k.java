
class Solution {
    public int minOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < k)
                return -1;
            if (nums[i] > k && !map.containsKey(nums[i])) {
                count++;
                map.put(nums[i], 1);
            }
        }
        return count;
    }
}