class Solution {
    public int[] minOperations(String boxes) {
        int len=boxes.length();
        int pre[]=new int[len];
        int post[]=new int[len];
        int answer[]=new int[len];
        int preCount=0;
        int postCount=0;
        if(boxes.charAt(0)=='1')
        preCount=1;
        if(boxes.charAt(len-1)=='1')
        postCount=1;
        for(int i=1;i<len;i++)
        {
            pre[i]=preCount+pre[i-1];
            post[len-i-1]=postCount+post[len-i];
            if(boxes.charAt(i)=='1')
            preCount++;
            if(boxes.charAt(len-i-1)=='1')
            postCount++;
        }
        for(int i=0;i<len;i++){
            answer[i]=pre[i]+post[i];
            System.out.println(pre[i]+" "+ post[i]);
        }
        
        return answer;
    }
}