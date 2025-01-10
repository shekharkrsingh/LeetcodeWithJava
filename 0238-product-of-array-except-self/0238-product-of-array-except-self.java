class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount=0;
        int totalMul=1;
        int size=nums.length;
        int zerothIndex=-1;
        int [] result=new int[size];
        for(int i=0;i<size;i++)
        {
            if(nums[i]==0){
                zeroCount++;
                zerothIndex=i;
            }
            else
            totalMul*=nums[i];
        }
        if(zeroCount>1)
        return result;
        if(zeroCount==1)
        {
            result[zerothIndex]=totalMul;
            return result;
        }
        for(int i=0;i<size;i++)
            result[i]=totalMul/nums[i];
        return result;
    }
}