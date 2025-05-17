class Solution {
    public void sortColors(int[] nums) {
        int one=0;
        int two=0;
        int zero=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            one++;
            if(nums[i]==0)
            zero++;
            if(nums[i]==2)
            two++;
        }System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        for(int i=0;i<nums.length;i++)
        {
            if(zero!=0)
            {
                nums[i]=0;
                zero--;
                continue;
            }
            if(zero==0 && one!=0)
            {
                nums[i]=1;
                one--;
                continue;
            }
            if(one==0 && zero==0)
            {
                nums[i]=2;
                continue;
            }
        }
    }
}