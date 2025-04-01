class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            maxVal = Math.max(maxVal, dfs(i, bombs, visited, n));
        }
        return maxVal;
    }

    private int dfs(int idx, int[][] bombs, boolean[] visited, int n) {
        visited[idx] = true;
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                long xLen = bombs[idx][0] - bombs[i][0];
                long yLen = bombs[idx][1] - bombs[i][1];
                long tSqr = xLen * xLen + yLen * yLen;
                long rSqr = (long) bombs[idx][2] * bombs[idx][2];
                if (tSqr <= rSqr)
                    count += dfs(i, bombs, visited, n);
            }
        }
        return count;
    }
}