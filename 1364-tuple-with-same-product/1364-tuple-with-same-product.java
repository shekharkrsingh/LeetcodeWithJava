import java.util.HashMap;

class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                int mul = nums[i] * nums[j];
                if (map.containsKey(mul)) {
                    int freq = map.get(mul);
                    count += 8 * freq;
                }
                map.put(mul, map.getOrDefault(mul, 0) + 1);
            }
        return count;
    }
}
