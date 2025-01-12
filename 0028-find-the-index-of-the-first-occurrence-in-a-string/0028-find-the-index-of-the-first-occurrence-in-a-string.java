class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int hayLength = haystack.length();
        if (needleLength > hayLength)
            return -1;
        for (int i = 0; i <= hayLength - needleLength; i++) {
            int j = 0;
            while (j < needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needleLength)
                return i;
        }
        return -1;
    }
}