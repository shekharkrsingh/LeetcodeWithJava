class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] check = new int[n][m];
        int totalConnectedServer = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    count++;
                check[i][j] = 0;
            }
            if (count >= 2) {
                for (int j = 0; j < m; j++)
                    if (grid[i][j] == 1)
                        check[i][j] = 1;
                totalConnectedServer += count;
            }
        }
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (grid[j][i] == 1)
                    count++;
            if (count >= 2)
                for (int j = 0; j < n; j++)
                    if (grid[j][i] == 1 && check[j][i] == 0)
                        totalConnectedServer++;
        }
        return totalConnectedServer;
    }
}