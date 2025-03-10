class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int [][]dp= new int[days.length][368];
        for(int i=0;i<days.length;i++)
            for(int j=0;j<368;j++)
                dp[i][j]=-1;
        return solution(366, days.length-1, days, costs, dp);
    }

    private int solution(int passValid, int idx, int[] days, int[]costs, int [][]dp){
        if(idx<0)
        return 0;
        if( passValid>=0 && dp[idx][passValid]!=-1)
        return dp[idx][passValid];
        if(passValid<=days[idx])
            return solution(passValid, idx-1, days, costs, dp);
        int first=solution(days[idx], idx-1, days, costs, dp)+costs[0];
        int second=solution(days[idx]-6, idx-1, days, costs, dp)+costs[1];
        int third=solution(days[idx]-29, idx-1, days, costs, dp)+costs[2];
        if(passValid>=0)
        dp[idx][passValid]=Math.min(first, Math.min(second, third));
        return Math.min(first, Math.min(second, third));
    }
}