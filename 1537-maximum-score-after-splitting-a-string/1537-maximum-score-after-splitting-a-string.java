class Solution {
    public int maxScore(String s) {
        int[] arr=new int[s.length()];
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                c+=1;
            }
            arr[i]=c;
        }
        // 111122
        int n=s.length();
        int ans=0;
        for(int i=0;i<n-1;i++){
            // zeroes from i+1 to last;
            int p=arr[n-1]-arr[i];
            // ones from i+1 to last
            int ones=n-(i+1)-p;
            ones+=arr[i];
            ans=Math.max(ans,ones);
        }
        return ans;


        
    }
}