class Solution {
    public String removeOuterParentheses(String s) {
        int n= s.length();
        int count=0;
        String result="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
            count++;
            if(count==1 && s.charAt(i)=='(')
            continue;
            if(s.charAt(i)==')')
            count--;
            if(count==0 && s.charAt(i)==')')
            continue;
            result+=s.charAt(i);
        }
        return result;
    }
}