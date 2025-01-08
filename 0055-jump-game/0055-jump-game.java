class Solution {
    public boolean canJump(int[] nums) {
        int count=1;
        int size=nums.length;
        if(size==1)
        return true;
        for(int i=size-2;i>=0;i--)
        {
            if(nums[i]>=count)
            count=1;
            else
            count++;
            if(count==1 && i==0)
            return true;
        }
        return false;
    }
}