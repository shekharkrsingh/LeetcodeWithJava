class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int n = s.length();
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        for (int i = 0; i < 26; i++)
            map1[i] = map2[i] = 0;
        for (int i = 0; i < n; i++) {
            map1[s.charAt(i) - 'a']++;
            map2[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++)
            if (map1[i] != map2[i])
                return false;
        return true;
    }
}