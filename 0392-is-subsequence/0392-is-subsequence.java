class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=t.length();
        int m=s.length();
        int idx1=0;
        int idx2=0;
        while(idx1<n)
        {
            if(idx2>=m)
            break;
            if(t.charAt(idx1)==s.charAt(idx2))
            {
                idx1++;
                idx2++;
            }else
            idx1++;
        }
        if(idx2>=m)
        return true;
        return false;
    }
}