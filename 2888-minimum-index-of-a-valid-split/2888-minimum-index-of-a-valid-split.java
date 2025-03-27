class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.size();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        int tar = -1;
        for (int key : map.keySet()) {
            if (map.get(key) >= n / 2 + 1) {
                tar = key;
                break;
            }
        }
        if (n == 1)
            return -1;

        int freq[] = new int[n];
        if (nums.get(0) == tar)
            freq[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) == tar)
                freq[i] = freq[i - 1] + 1;
            else
                freq[i] = freq[i - 1];
        }

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1 - i;
            if (freq[i] >= left / 2 + 1 && (freq[n - 1] - freq[i]) >= right / 2 + 1)
                return i;
        }
        return -1;

    }

}