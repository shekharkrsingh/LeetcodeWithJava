class Solution {
    static int total;

    public int subsetXORSum(int[] nums) {
        total=0;
        xor(nums, 0, 0);
        return total;
    }

    public static void xor(int[] nums, int index, int currXor) {
        if (index == nums.length) {
            total += currXor;
            return;
        }

        xor(nums, index + 1, currXor ^ nums[index]);
        xor(nums, index + 1, currXor);
    }
}