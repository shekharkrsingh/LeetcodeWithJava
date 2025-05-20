class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] arr = new int[nums.length + 1];
        for (int[] query : queries) {
            arr[query[0]] += 1;
            arr[query[1] + 1] -= 1;
        }
        for (int i = 1; i < arr.length; i++)
            arr[i] = arr[i] + arr[i - 1];
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > arr[i])
                return false;
        return true;
    }
}