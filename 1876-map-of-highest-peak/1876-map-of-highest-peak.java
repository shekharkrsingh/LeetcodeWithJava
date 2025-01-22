class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean visited[][] = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    queue.offer(new int[] { i, j });
                    visited[i][j] = true;
                }
            }
        }
        int dir[][] = { { 0, +1 }, { 0, -1 }, { +1, 0 }, { -1, 0 } };
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int cur[] = queue.poll();
                int i = cur[0];
                int j = cur[1];
                isWater[i][j] = steps;
                for (int k = 0; k < 4; k++) {
                    int row = i + dir[k][0];
                    int col = j + dir[k][1];
                    if (row < 0 || col < 0 || row == m || col == n || visited[row][col]) {
                        continue;
                    }
                    queue.offer(new int[] { row, col });
                    visited[row][col] = true;
                }
            }
            steps++;
        }
        return isWater;
    }
}