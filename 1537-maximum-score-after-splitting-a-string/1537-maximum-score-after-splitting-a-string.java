public class Solution {
    public int maxScore(String inputStr) {
        int zeroCount=0;
        int oneCount=0;
        int splitZeroCount=0;
        int splitOneCount=0;
        int maxScore=0;
        int len=inputStr.length();

        for(int i=0;i<len;i++)
        {
            if(inputStr.charAt(i)=='0')
            zeroCount++;
            else
            oneCount++;
        }
        for(int i=0;i<len-1;i++)
        {
            if(inputStr.charAt(i)=='0')
            splitZeroCount++;
            else
            splitOneCount++;
            int score=splitZeroCount+(oneCount-splitOneCount);
            maxScore=Math.max(score, maxScore);
        }
        return maxScore;
    }
}