class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int a : nums)
            sum += a;
        return (n * (n + 1) / 2) - sum;
    }
}