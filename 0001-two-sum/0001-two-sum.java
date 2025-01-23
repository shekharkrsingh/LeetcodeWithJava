class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining) && map.get(remaining) != i) {
                result[0] = map.get(remaining);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}