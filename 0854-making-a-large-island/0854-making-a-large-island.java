class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int uid = 1;
        int maxSize = 0;
        Map<Integer, Integer> uidMap = new HashMap<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                visited[i][j] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == -1 && grid[i][j] == 1) {
                    int size = dfs(i, j, visited, n, m, uid, grid);
                    uidMap.put(uid, size);
                    maxSize = Math.max(maxSize, size);
                    uid++;
                }
            }
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    HashSet<Integer> set = new HashSet<>();
                    if (i > 0 && grid[i - 1][j] == 1)
                        set.add(visited[i - 1][j]);
                    if (i < n - 1 && grid[i + 1][j] == 1)
                        set.add(visited[i + 1][j]);
                    if (j > 0 && grid[i][j - 1] == 1)
                        set.add(visited[i][j - 1]);
                    if (j < m - 1 && grid[i][j + 1] == 1)
                        set.add(visited[i][j + 1]);
                    int islandSize = 1;
                    for (Integer element : set)
                        islandSize += uidMap.get(element);
                    maxSize = Math.max(maxSize, islandSize);
                }
            }
        return maxSize;
    }

    private int dfs(int i, int j, int[][] visited, int n, int m, int uid, int[][] grid) {
        if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j] != -1 || grid[i][j] == 0)
            return 0;

        visited[i][j] = uid;
        int first = dfs(i + 1, j, visited, n, m, uid, grid);
        int second = dfs(i - 1, j, visited, n, m, uid, grid);
        int third = dfs(i, j + 1, visited, n, m, uid, grid);
        int forth = dfs(i, j - 1, visited, n, m, uid, grid);
        return first + second + third + forth + 1;
    }
}