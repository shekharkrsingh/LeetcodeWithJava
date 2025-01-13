class Solution {
    public int minimumLength(String s) {
        int[] count = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++)
            count[s.charAt(i) - 'a']++;
        int totalVarity = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0)
                continue;
            if (count[i] % 2 == 0)
                totalVarity += 2;
            else
                totalVarity += 1;
        }
        return totalVarity;
    }
}