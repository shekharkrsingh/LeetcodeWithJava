class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                int mul = nums[i] * nums[j];
                if (map.containsKey(mul))
                    map.put(mul, map.get(mul) + 1);
                else
                    map.put(mul, 1);
            }
        for (Map.Entry<Integer, Integer> val : map.entrySet())
            count += 8 * nC2(val.getValue());
        return count;
    }

    private int nC2(int n) {
        return (n * (n - 1)) / 2;
    }
}