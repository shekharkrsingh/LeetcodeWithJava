class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                dp[i][j]=-1;
            }
        }
        return sol(m, n, dp);
    }

    private int sol(int m ,int n, int[][] dp)
    {
        if(m==1 && n==1)
        return 1;
        if(m==0 || n==0)
        return 0;
        if(dp[m-1][n-1]!=-1)
        return dp[m-1][n-1];
        int right= sol(m, n-1, dp);
        int down= sol(m-1, n, dp);
        dp[m-1][n-1]=right+down;
        return right+down;
    }


}







// class Solution {
//     public int uniquePaths(int m, int n) {
//         if(m==1 && n==1)
//         return 1;
//         if(m==0 || n==0)
//         return 0;
//         int right= uniquePaths(m, n-1);
//         int down= uniquePaths(m-1, n);
//         return right+down;
//     }

// }