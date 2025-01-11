class Solution {
    public boolean canConstruct(String s, int k) {
        int[] count = new int[26];
        int len = s.length();
        int nonPairCount = 0;
        int pairCount = 0;
        for (int i = 0; i < len; i++)
            count[s.charAt(i) - 'a']++;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0)
                nonPairCount++;
            pairCount = count[i] / 2;
        }
        if (nonPairCount > k || len < k)
            return false;
        return true;
    }
}