class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        int[] ans = new int[2];
        int start = 0;
        int end = size - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                ans[0] = start + 1;
                ans[1] = end + 1;
            }
            if (sum > target) {
                end--;
                continue;
            }
            start++;
        }
        return ans;
    }
}