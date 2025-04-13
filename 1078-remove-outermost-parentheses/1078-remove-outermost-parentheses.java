class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(')
                count++;
            if (s.charAt(i) == ')')
                count--;
            if ((count == 1 && s.charAt(i) == '(') || (count == 0 && s.charAt(i) == ')'))
                continue;
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}