class Solution {
    public int[] constructDistancedSequence(int n) {
        int res[] = new int[n * 2 - 1];
        get_ans(res, 0, new boolean[n], n);
        return res;
    }
    private boolean get_ans(int res[], int i, boolean used[], int n){
        if(i == res.length)     return true;
        else if(res[i] != 0)    return get_ans(res, i + 1, used, n);
        for(int curr = n; curr > 0; curr--){
            if(!used[curr - 1] && (curr == 1 || (i + curr < res.length && res[i + curr] == 0))){
                res[i] = curr;
                if(curr != 1)   res[i + curr] = curr;
                used[curr - 1] = true; 
                if(get_ans(res, i + 1, used, n))    return true;
                res[i] = 0;
                if(curr != 1)   res[i + curr] = 0;
                used[curr - 1] = false;
            }
        }
        return false;
    }
}