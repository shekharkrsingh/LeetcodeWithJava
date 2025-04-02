
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        boolean flag = true;
        long maxVal = 0;
        for (int a : nums)
            if (a >= 0)
                flag = false;
        if (flag)
            return 0;
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                for (int k = j+1; k < n; k++){
                    long res=((long)(nums[i] - nums[j])) * nums[k];
                    System.out.println(res);
                    maxVal= res>maxVal?res: maxVal;
                }
        return maxVal;
    }
}