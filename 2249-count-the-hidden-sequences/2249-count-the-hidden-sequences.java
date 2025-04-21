class Solution {
    public int numberOfArrays(int[] a, int lower, int upper) {
        long val  = 0;
        long minVal = 0;
        long maxVal = 0;
        for(int it: a){
            val += it;
            minVal = Math.min(minVal , val);
            maxVal = Math.max(maxVal , val);
        }
        return Math.max(0, (int)(upper - lower - maxVal + minVal + 1));
    }
}