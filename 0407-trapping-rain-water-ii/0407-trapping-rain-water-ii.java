class Solution {
    int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0)
            return 0;
        int m = heightMap.length;
        int n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Cell> pq = new PriorityQueue<>((a, b) -> a.height - b.height);
        for (int i = 0; i < m; i++) {
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, n - 1, heightMap[i][n - 1]));
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }
        for (int j = 0; j < n; j++) {
            pq.offer(new Cell(0, j, heightMap[0][j]));
            pq.offer(new Cell(m - 1, j, heightMap[m - 1][j]));
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }
        int waterTrapped = 0;
        while (!pq.isEmpty()) {
            Cell cell = pq.poll();
            for (int[] dir : dirs) {
                int x = cell.x + dir[0];
                int y = cell.y + dir[1];
                if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y])
                    continue;
                waterTrapped += Math.max(0, cell.height - heightMap[x][y]);
                pq.offer(new Cell(x, y, Math.max(cell.height, heightMap[x][y])));
                visited[x][y] = true;
            }
        }
        return waterTrapped;
    }
}

class Cell {
    int x, y, height;
    public Cell(int x, int y, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }
}