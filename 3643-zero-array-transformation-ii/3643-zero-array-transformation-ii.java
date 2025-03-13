class Solution {
    public int minZeroArray(int[] nums, int[][] qur) {
        int len = nums.length;
        int ql = qur.length;
        int[] ar = new int[len+1];
        int qi = 0;
        int i = 0;
        int sum = 0;
        while( i < len && nums[i] <= sum){
            i++;
        }
        if(i == len)return 0;
        while(qi < ql){
            int l = qur[qi][0];
            int r = qur[qi][1];
            int v = qur[qi][2];
            ar[l] += v;
            ar[r+1] -= v;
            if(i <= r && i >= l){
                sum += v;
            }
            while( i < len && sum >= nums[i]){
                i++;
                sum += ar[i];
            }
            qi++;
            if(i == len)return qi;
        }
        return -1;
    }
}