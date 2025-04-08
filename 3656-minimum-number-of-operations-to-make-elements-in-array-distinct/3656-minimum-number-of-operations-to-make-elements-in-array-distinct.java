class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int it : nums) {
            if (!map.containsKey(it))
                map.put(it, 0);
            map.put(it, map.get(it) + 1);
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            while (entry.getValue() > 1) {
                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }
        return (i % 3 == 0) ? (i / 3) : (i / 3) + 1;
    }
}