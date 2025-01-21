class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long rowSum = 0;
        long minValue = Long.MAX_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++)
            rowSum += grid[0][i];
        for (int i = 0; i < n; i++) {
            rowSum -= grid[0][i];
            minValue = Math.min(minValue, Math.max(rowSum, sum));
            sum += grid[1][i];
        }
        return minValue;
    }
}