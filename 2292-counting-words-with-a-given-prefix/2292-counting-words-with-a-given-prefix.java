class Solution {
    public int prefixCount(String[] words, String pref) {
        int size=words.length;
        int count=0;
        for(int i=0;i<size;i++)
        {
            if(prefixCheck(pref, words[i]))
            count++;
        }
        return count;
    }

    public boolean prefixCheck(String st1, String st2)
    {
        int n=st1.length();
        int m=st2.length();
        if(m<n)
        return false;
        for(int i=0;i<n;i++)
        {
            if(st1.charAt(i)!=st2.charAt(i))
            return false;
        }
        return true;
    }
}