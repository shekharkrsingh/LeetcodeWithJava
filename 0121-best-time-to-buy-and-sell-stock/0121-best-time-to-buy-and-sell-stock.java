class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int maxValue=0;
        int profite=0;
        for(int i=n-1;i>=0;i--){
            maxValue= Math.max(maxValue, prices[i]);
            profite=Math.max(profite, maxValue-prices[i]);
        }
        return profite;
    }
}