class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0;
        int end=n-1;
        int maxWater=0;
        while(end>start)
        {
            maxWater=Math.max(maxWater,Math.min(height[start], height[end])*(end-start));
            System.out.println(maxWater + " "+ start+ " "+ end);
            if(height[start]<height[end]){
                start++;
                continue;
            }
            if(height[end]<=height[start])
            end--;
        }
        return maxWater;
    }
}