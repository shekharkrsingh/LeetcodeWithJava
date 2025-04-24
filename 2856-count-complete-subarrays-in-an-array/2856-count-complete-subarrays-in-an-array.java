class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int distinct = set.size();
        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                seen.add(nums[j]);
                if (seen.size() == distinct)
                    count++;
            }
        }
        return count;
    }
}