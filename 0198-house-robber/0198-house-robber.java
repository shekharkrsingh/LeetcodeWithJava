class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        if (size == 0)
            return 0;
        if (size == 1)
            return nums[0];
        int first = 0;
        int second = nums[0];
        int third = nums[1];
        for (int i = 2; i < size; i++) {
            int temp = Math.max(first, second) + nums[i];
            first = second;
            second = third;
            third = temp;
        }
        return Math.max(second, third);
    }
}