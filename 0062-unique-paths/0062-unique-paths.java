class Solution {
    public int uniquePaths(int n, int m) {
        int[] dp= new int[m];
        for(int i=0;i<m;i++){
            dp[i]=1;
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                dp[j]=dp[j+1]+dp[j];
            }
        }
        return dp[0];
    }
}