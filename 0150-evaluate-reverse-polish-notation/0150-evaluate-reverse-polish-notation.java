class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            String c = tokens[i];
            if (c.equals("+")) {
                st.push(st.pop() + st.pop());
                continue;
            }
            if (c.equals("-")) {
                int num1 = st.pop();
                st.push(st.pop() - num1);
                continue;
            }
            if (c.equals("*")) {
                st.push(st.pop() * st.pop());
                continue;
            }
            if (c.equals("/")) {
                int num1 = st.pop();
                st.push(st.pop() / num1);
                continue;
            }
            st.push(stringToNumber(c));
        }
        return st.pop();
    }

    private int stringToNumber(String c) {
        int num = 0;
        boolean flag = false;
        for (int j = 0; j < c.length(); j++) {
            if (c.charAt(j) == '-') {
                flag = true;
                continue;
            }
            num *= 10;
            num += c.charAt(j) - '0';
        }
        return flag ? (-1 * num) : num;
    }
}