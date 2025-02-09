class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> value= new HashMap<>();
        long bad =0;
        for(int i=0; i<nums.length; i++){
            int j = nums[i]-i;
            bad += value.getOrDefault(j,0);
            value.put(j, value.getOrDefault(j,0)+1);
        }
        return (long) nums.length*(nums.length-1)/2 - bad;
    }
}