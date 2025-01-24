
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums)
            numSet.add(num);
        int maxCount = 0;
        for (int num : numSet)
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        return maxCount;
    }
}
