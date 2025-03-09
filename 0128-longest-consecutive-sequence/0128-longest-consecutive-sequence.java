
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums)
            set.add(a);
        int maxCount = 0;
        for (int a : set)
            if (!set.contains(a - 1)) {
                int count = 0;
                while (set.contains(a)) {
                    count++;
                    a++;
                }
                maxCount = Math.max(maxCount, count);
            }
        return maxCount;
    }
}
