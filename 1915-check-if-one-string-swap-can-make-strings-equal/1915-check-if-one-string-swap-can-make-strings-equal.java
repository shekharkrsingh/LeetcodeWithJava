class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int[] arr = new int[26];
        int countMisplaced = 0;
        for (int i = 0; i < 26; i++)
            arr[i] = 0;
        for (int i = 0; i < n; i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
            if (s1.charAt(i) != s2.charAt(i))
                countMisplaced++;
        }
        for (int i = 0; i < 26; i++)
            if (arr[i] != 0)
                return false;
        if (countMisplaced == 0 || countMisplaced == 2)
            return true;
        return false;
    }
}