class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int size=nums.length;
        int cnt1=1;
        int cnt2=1;
        for(int i=1;i<size;i++){
            if(nums[i]>nums[i-1]){
                cnt1++;
                max=Math.max(max, cnt1);
            }else
            cnt1=1;
            if(nums[i]<nums[i-1]){
                cnt2++;
                max=Math.max(max, cnt2);
            }
            else
            cnt2=1;
        }
        return max;
    }
}