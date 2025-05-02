class Solution {
    public String pushDominoes(String d) {
        int n = d.length();
        StringBuilder res = new StringBuilder(d);
        int[] beforeRight = new int[n];
        int[] afterLeft = new int[n];
        int idx = -1;
        int idx2 = -1;
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            if (d.charAt(i) == 'R')
                idx = i;
            else if (d.charAt(i) == 'L')
                idx = -1;
            else
                beforeRight[i] = idx;

            if (d.charAt(j) == 'L')
                idx2 = j;
            else if (d.charAt(j) == 'R')
                idx2 = -1;
            else
                afterLeft[j] = idx2;

        }

        for (int i = 0; i < n; i++) {
            if (res.charAt(i) == '.') {
                int right = beforeRight[i];
                int left = afterLeft[i];
                if (right == left)
                    continue;
                else if (right == -1)
                    res.setCharAt(i, 'L');
                else if (left == -1)
                    res.setCharAt(i, 'R');
                else if (i - right == left - i)
                    continue;
                else
                    res.setCharAt(i, i - right < left - i ? 'R' : 'L');
            }
        }
        return res.toString();
    }
}