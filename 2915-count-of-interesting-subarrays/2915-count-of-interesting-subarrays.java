
class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int n = nums.size();
        Map<Integer, Long> mp = new HashMap<>();
        long sum = 0;
        long result = 0;
        mp.put(0, 1L);

        for (int i = 0; i < n; i++) {
            if (nums.get(i) % modulo == k)
                sum += 1;
            int r1 = (int) (sum % modulo);
            int r2 = (r1 - k + modulo) % modulo;
            result += mp.getOrDefault(r2, 0L);
            mp.put(r1, mp.getOrDefault(r1, 0L) + 1);
        }

        return result;
    }
}