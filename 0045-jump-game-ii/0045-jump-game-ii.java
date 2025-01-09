class Solution {
    public int jump(int[] nums) {
        int size = nums.length;
        int[] maxJump = new int[size];
        maxJump[0] = 0;
        for (int i = 1; i < size; i++) {
            int min = Integer.MAX_VALUE - 1;
            for (int j = 0; j < i; j++)
                if (nums[j] >= i - j)
                    min = Math.min(min, maxJump[j]);
            maxJump[i] = min + 1;
        }
        return maxJump[size - 1];
    }
}