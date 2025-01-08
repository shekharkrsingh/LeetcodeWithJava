class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        int size=words.length;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(isPrefixAndSuffix(words[i], words[j]))
                count++;
            }
        }
        return count;
    }
    

    boolean isPrefixAndSuffix(String st1, String st2)
    {
        int n1=st1.length();
        int n2=st2.length();
        if(n1>n2)
        return false;
        for(int i=0;i<n1;i++)
        {
            if(st1.charAt(i)!=st2.charAt(i))
            return false;
        }
        for(int i=0;i<n1;i++)
        {
            if(st1.charAt(n1-i-1)!=st2.charAt(n2-i-1))
            return false;
        }
        return true;
    }
}