class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        int n=nums.length;
        for(int a: nums){
            if(a<0)
            neg++;
            if(a>0)
            pos++;
        }
        return Math.max(neg, pos);
    }
}