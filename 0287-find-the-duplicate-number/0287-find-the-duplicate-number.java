class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=Math.abs(nums[i])-1;
            if(nums[val]>0){
                nums[val]*=-1;
            }else{
                return Math.abs(nums[i]);
            }
        }
        return -1;
    }
}