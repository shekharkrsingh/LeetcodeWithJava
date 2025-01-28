class Solution {
    public int findMaxFish(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxFish = 0;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (!visited[i][j] && grid[i][j] > 0)
                    maxFish = Math.max(maxFish, dfs(grid, visited, i, j, n, m));
        return maxFish;
    }

    private int dfs(int[][] grid, boolean[][] visited, int i, int j, int n, int m) {
        if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || grid[i][j] <= 0)
            return 0;
        visited[i][j] = true;
        int fishCount = grid[i][j];
        fishCount += dfs(grid, visited, i - 1, j, n, m);
        fishCount += dfs(grid, visited, i + 1, j, n, m);
        fishCount += dfs(grid, visited, i, j - 1, n, m);
        fishCount += dfs(grid, visited, i, j + 1, n, m);
        return fishCount;
    }
}
