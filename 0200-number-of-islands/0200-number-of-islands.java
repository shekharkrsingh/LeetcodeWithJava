class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (!visited[i][j] && grid[i][j] == '1') {
                    bfs(i, j, n, m, grid, visited);
                    count++;
                }
        return count;
    }

    private void bfs(int i, int j, int n, int m, char[][] grid, boolean[][] visited) {
        if (i >= n || j >= m || i < 0 || j < 0 || visited[i][j] || grid[i][j] == '0')
            return;
        visited[i][j] = true;
        bfs(i + 1, j, n, m, grid, visited);
        bfs(i - 1, j, n, m, grid, visited);
        bfs(i, j + 1, n, m, grid, visited);
        bfs(i, j - 1, n, m, grid, visited);
    }
}