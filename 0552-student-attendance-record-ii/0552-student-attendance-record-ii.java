class Solution {
    public int checkRecord(int n) {
        int[][][]dp=new int[n+1][2][3];
        for(int i=0;i<=n;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return sol(n, 0, 0, dp);
    }

    private int sol(int n, int aCount, int lCount, int [][][]dp){
        if(lCount>2 || aCount>1)
        return 0;
        if(n==0)
        return 1;
        if(dp[n][aCount][lCount]!=-1)
        return dp[n][aCount][lCount];
        long count=0;
        count=sol(n-1, aCount+1, 0, dp);
        count+=sol(n-1, aCount, lCount+1, dp);
        count+=sol(n-1, aCount, 0, dp);
        dp[n][aCount][lCount]=((int)(count%1000000007));
        return dp[n][aCount][lCount];
    }
}