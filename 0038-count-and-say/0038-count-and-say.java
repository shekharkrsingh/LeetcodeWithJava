class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        return sol(n - 1, "1");
    }

    private String sol(int n, String s) {
        int len = s.length();
        int count = 1;
        StringBuilder newSt = new StringBuilder();
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                newSt.append(count);
                newSt.append(s.charAt(i - 1));
                count = 0;
            }
            count++;
        }
        newSt.append(count);
        newSt.append(s.charAt(len - 1));
        if (n == 1)
            return newSt.toString();
        return sol(n - 1, newSt.toString());
    }
}