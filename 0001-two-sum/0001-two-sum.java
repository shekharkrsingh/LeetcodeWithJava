class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>();
        int n= nums.length;
        int []ans=new int[2];
        for(int i=0;i<n;i++){
            int remaining= target-nums[i];
            System.out.println(remaining);
            if(map.containsKey(remaining)){
                ans[0]=map.get(remaining);
                ans[1]=i;
            }else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}