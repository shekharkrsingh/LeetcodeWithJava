class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minSize=Integer.MAX_VALUE;
        int sum=nums[0];
        int first=0;
        int second=0;
        while(second<n)
        {
            if(sum>=target)
                minSize=Math.min(minSize, second-first+1);
                
            if(sum>=target && first<second){
                sum-=nums[first];
                first++;
                continue;
            }
            second++;
            if(second<n)
            sum+=nums[second];
        }
        return minSize==Integer.MAX_VALUE?0:minSize;
    }
}