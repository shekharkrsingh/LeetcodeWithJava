class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++)
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        int first=0;
        int second = 0;
        while (second < n) {
            if (nums[second] != 0) {
                int temp = nums[second];
                nums[second] = nums[first];
                nums[first] = temp;
                first++;
            }
            second++;
        }
        return nums;
    }
}
