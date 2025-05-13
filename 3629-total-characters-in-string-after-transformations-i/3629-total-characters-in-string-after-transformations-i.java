class Solution {
    private static int MOD = 1_000_000_007;

    public int lengthAfterTransformations(String s, int t) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray())
            freq[ch - 'a']++;
        for (int st = 0; st < t; st++) {
            int[] next = new int[26];
            for (int i = 0; i < 26; i++)
                if (i == 25) {
                    next[0] = (next[0] + freq[25]) % MOD;
                    next[1] = (next[1] + freq[25]) % MOD;
                } else
                    next[i + 1] = (next[i + 1] + freq[i]) % MOD;
            freq = next;
        }
        long totalLength = 0;
        for (int cnt : freq)
            totalLength = (totalLength + cnt) % MOD;
        return (int) totalLength;
    }
}