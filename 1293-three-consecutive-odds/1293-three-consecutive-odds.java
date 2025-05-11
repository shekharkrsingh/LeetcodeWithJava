class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int it: arr){
            if(it%2!=0)
            count++;
            else
            count=0;
            if(count==3)
            return true;
        }
        return false;
    }
}