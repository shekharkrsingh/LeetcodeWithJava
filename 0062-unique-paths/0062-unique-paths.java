class Solution {
    public int uniquePaths(int n, int m) {
        int[][] dp = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int count = 0;
                int t=0;
                if (i + 1 < n) {
                    count += dp[i + 1][j];
                }
                if (j + 1 < m) { 
                    count += dp[i][j + 1];
                }
                if(i + 1 < n && j + 1 < m){
                    count++;
                }
                dp[i][j] = count;
            }
        }
        return dp[0][0]+1;
    }
}