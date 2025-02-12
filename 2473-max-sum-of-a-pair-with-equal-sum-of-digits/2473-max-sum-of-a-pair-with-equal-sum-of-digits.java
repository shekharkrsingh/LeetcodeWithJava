class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int maxVal = -1;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int sum = sumOfDegi(nums[i]);
            if (map.containsKey(sum)) {
                List<Integer> list = map.get(sum);
                list.add(nums[i]);
                map.put(sum, list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                map.put(sum, list);
            }
        }
        for (Map.Entry<Integer, List<Integer>> a : map.entrySet()) {
            List<Integer> list = a.getValue();
            int size = list.size();
            Collections.sort(list);
            if (size > 1)
                maxVal = Math.max(maxVal, list.get(size - 2) + list.get(size - 1));
        }
        return maxVal;

    }

    private int sumOfDegi(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}