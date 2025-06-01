class Solution {
    public long distributeCandies(int n, int limit) {
        long ans = 0;
        for (int i=0;i<=Math.min(limit,n);i++){
            int rest = n - i;
            if (rest>2*limit) continue;
            int maxi = Math.min(limit,rest);
            int mini = rest - maxi;
            ans += (maxi-mini+1);
        }  
        return ans;
    }
}