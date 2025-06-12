class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff=0;
        int n=nums.length;
        for(int i=1;i<n;i++)
        maxDiff=Math.max(Math.abs(nums[i]-nums[i-1]), maxDiff);
        maxDiff=Math.max(Math.abs(nums[n-1]-nums[0]), maxDiff);
        return maxDiff;
    }
}