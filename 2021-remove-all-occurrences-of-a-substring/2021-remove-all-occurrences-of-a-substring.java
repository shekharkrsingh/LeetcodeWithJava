class Solution {
    public String removeOccurrences(String s, String part) {
        if(s.length() < part.length()) return s;
        int n = part.length();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            st.push(ch);
            if(st.peek() == part.charAt(n-1)){
                int i = n-1;
                while(i >= 0 && !st.isEmpty() && st.peek() == part.charAt(i)){
                    st.pop(); 
                    i--;
                }
                if(i >= 0){
                    i++;
                    while(i<n){
                        st.push(part.charAt(i));
                        i++;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());

        return sb.reverse().toString();
    }
}