class Solution {
    public int minOperations(int[] nums) {
        int ans = 0, k = 3;
        int n = nums.length;
        for (int i = 0; i < n - k + 1; i++) {
            if (nums[i] == 0) {
                ans++;
                for (int j = 0; j < k; j++)
                    nums[i + j] ^= 1;
            }
        }
        for (int i = n - 1; i >= n - k; i--)
            if (nums[i] != 1)
                return -1;
        return ans;
    }
}