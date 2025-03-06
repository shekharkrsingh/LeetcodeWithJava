class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;
        HashSet<Integer> set = new HashSet<>();
        int repeated = -1;
        int missing = -1;
        int sum = 0;
        int totalSum = total * (total + 1) / 2;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                sum += val;
                if (set.contains(val))
                    repeated = val;
                else
                    set.add(val);
            }
        missing = totalSum - (sum - repeated);
        int result[]={ repeated, missing };
        return result;
    }
}
