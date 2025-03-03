class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++)
            if (nums[i] < pivot) {
                arr[count] = nums[i];
                count++;
            }
        for (int i = 0; i < n; i++)
            if (nums[i] == pivot) {
                arr[count] = pivot;
                count++;
            }
        for (int i = 0; i < n; i++)
            if (nums[i] > pivot) {
                arr[count] = nums[i];
                count++;
            }
        return arr;
    }
}