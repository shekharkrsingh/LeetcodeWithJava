class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int it : nums)
            if ((it + "").length() % 2 == 0)
                count++;
        return count;
    }
}