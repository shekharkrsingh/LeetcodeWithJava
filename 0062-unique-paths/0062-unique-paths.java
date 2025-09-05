class Solution {
    public int uniquePaths(int n, int m) {
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        return path(0, 0, n, m, dp);
    }

    private int path(int i, int j, int n, int m, int[][] dp) {
        if (i >= n || j >= m)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (i == n - 1 && j == m - 1)
            return 1;
        int total = 0;
        total += path(i + 1, j, n, m, dp);
        total += path(i, j + 1, n, m, dp);
        dp[i][j] = total;
        return total;
    }
}