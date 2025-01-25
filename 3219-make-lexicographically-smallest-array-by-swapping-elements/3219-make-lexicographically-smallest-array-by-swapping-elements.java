class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int[] pair = new int[2];
            pair[0] = nums[i];
            pair[1] = i;
            arr[i] = pair;
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        int first = 0;
        int second = 1;
        while (first != n) {
            if (second >= n || arr[second][0] - arr[second - 1][0] > limit) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i = first; i < second; i++)
                    temp.add(arr[i][1]);
                Collections.sort(temp);
                for (int i = 0; i < second - first; i++)
                    nums[temp.get(i)] = arr[first + i][0];
                first = second;
            }
            second++;
        }
        return nums;
    }
}