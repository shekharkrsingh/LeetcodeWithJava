class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum=0;
        int size=nums.length;
        int validSplit=0;
        long sum=0;
        for(int i=0;i<size;i++)
        totalSum+=nums[i];
        for(int i=0;i<size-1;i++)
        {
            sum+=nums[i];
            if(sum>=totalSum-sum)
            validSplit++;
        }
        return validSplit;
    }
}