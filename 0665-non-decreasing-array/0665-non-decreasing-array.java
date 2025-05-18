class Solution {
    public boolean checkPossibility(int[] nums) {
        int n=nums.length;
        boolean flag=false;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]>nums[i+1])
            {
                if(flag==false)
                {
                    if(i+2<n && nums[i]<nums[i+2])
                    {
                        nums[i+1]=nums[i+2];
                        flag=true;
                    }else if(i+2>=n)
                    {
                        nums[i+1]=nums[i];
                        flag=true;
                    }else
                    {
                        nums[i]=nums[i+1];
                        flag=true;
                    }
                }
                else
                return false;
            }
        }
        return true;
    }
}