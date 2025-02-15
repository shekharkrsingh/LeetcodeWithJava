class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++)
            if (f(i))
                ans += i * i;
        return ans;
    }

    public boolean f(int n) {
        String s = "" + (n * n);
        return ff(0, s, 0, n);
    }

    public boolean ff(int idx, String s, int ssf, int n) {
        if (idx == s.length()) {
            if (ssf == n)
                return true;
            return false;
        }
        String pp = "";
        for (int i = idx; i < s.length(); i++) {
            pp += s.charAt(i);
            boolean b = ff(i + 1, s, ssf + Integer.parseInt(pp), n);
            if (b)
                return true;
        }
        return false;
    }
}