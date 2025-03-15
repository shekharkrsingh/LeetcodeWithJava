class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        boolean[][] visited = new boolean[n][m];
        int startColor = image[sr][sc];
        bfs(image, sr, sc, color, visited, n, m, startColor);
        return image;
    }

    private void bfs(int[][] image, int sr, int sc, int color, boolean[][] visited, int n, int m, int startColor) {
        System.out.println(sr + " " + sc);
        if (sr >= n || sc >= m || sr < 0 || sc < 0 || image[sr][sc] != startColor || visited[sr][sc])
            return;
        visited[sr][sc] = true;
        image[sr][sc] = color;
        bfs(image, sr + 1, sc, color, visited, n, m, startColor);
        bfs(image, sr - 1, sc, color, visited, n, m, startColor);
        bfs(image, sr, sc + 1, color, visited, n, m, startColor);
        bfs(image, sr, sc - 1, color, visited, n, m, startColor);
    }
}