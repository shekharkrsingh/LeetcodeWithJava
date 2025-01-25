class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c=s.charAt(i);
            if (c== '(' || c== '{' || c== '[')
                st.push(s.charAt(i));
            if (c== ')')
                if (st.size() != 0 && st.peek() == '(')
                    st.pop();
                else
                    return false;
            if (c== ']')
                if (st.size() != 0 && st.peek() == '[')
                    st.pop();
                else
                    return false;
            if (c== '}')
                if (st.size() != 0 && st.peek() == '{')
                    st.pop();
                else
                    return false;
        }
        if (st.isEmpty())
            return true;
        return false;
    }
}