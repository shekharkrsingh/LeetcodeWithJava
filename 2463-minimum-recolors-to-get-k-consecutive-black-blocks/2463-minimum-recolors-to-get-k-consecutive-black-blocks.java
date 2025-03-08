class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int maxBlack = 0;
        int count = 0;
        for (int i = 0; i < k; i++)
            if (blocks.charAt(i) == 'B')
                count++;
        maxBlack = count;
        int first = 0;
        int last = k - 1;
        while (last != n) {
            if (blocks.charAt(first) == 'B')
                count--;
            first++;
            if (last < n - 1 && blocks.charAt(last + 1) == 'B')
                count++;
            last++;
            maxBlack = Math.max(maxBlack, count);
        }
        return k - maxBlack;
    }
}