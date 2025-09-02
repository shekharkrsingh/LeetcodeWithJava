class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int first=0;
        int second=0;
        while(second<n){
            if(nums[second]==0){
                swap(first, second, nums);
                first++;
            }else{
                second++;
            }
            if(first>second){
                second=first;
            }
        }
        first=n-1;
        second=n-1;
        while(second>=0){
            if(nums[second]==2){
                swap(first, second, nums);
                first--;
            }else{
                second--;
            }
            if(first<second){
                second=first;
            }
        }
    }

    private void swap(int i, int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}