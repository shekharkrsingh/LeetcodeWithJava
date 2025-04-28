class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        int first = 0;
        int second = 0;
        long sum = 0;
        long count = 0;
        while (second < n) {
            sum += nums[second];
            second++;
            while (first < second && k <= sum * (second - first)) {
                sum -= nums[first];
                first++;
            }
            count += second - first;
        }
        return count;
    }
}