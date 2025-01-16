class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int start = i + 1;
            int end = n - 1;
            while (start < end) {
                if (start != i + 1 && nums[start] == nums[start - 1]) {
                    start++;
                    continue;
                }
                if (end != n - 1 && nums[end] == nums[end + 1]) {
                    end--;
                    continue;
                }
                if (nums[start] + nums[end] + nums[i] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    result.add(list);
                    start++;
                    end--;
                }
                if (nums[start] + nums[end] + nums[i] < 0)
                    start++;
                if (nums[start] + nums[end] + nums[i] > 0)
                    end--;
            }
        }
        return result;
    }
}