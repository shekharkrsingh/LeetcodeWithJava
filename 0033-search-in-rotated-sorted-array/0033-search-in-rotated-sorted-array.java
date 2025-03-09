class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        return binarySearch(0, n, nums, target);
    }

    private int binarySearch(int left, int right,int[] nums, int target) {
        if (left > right)
            return -1;
        int mid = left + (right - left) / 2;
        if (target == nums[mid])
            return mid;
        if (target > nums[mid] && (target <= nums[right] || nums[mid] > nums[right]))
            return binarySearch(mid + 1, right, nums, target);
        if (target > nums[mid])
            return binarySearch(left, mid - 1, nums, target);
        if (target < nums[mid] && (target >= nums[left] || nums[mid] < nums[right]))
            return binarySearch(left, mid - 1, nums, target);
        if (target < nums[mid] && target < nums[left])
            return binarySearch(mid + 1, right, nums, target);
        return -1;
    }
}