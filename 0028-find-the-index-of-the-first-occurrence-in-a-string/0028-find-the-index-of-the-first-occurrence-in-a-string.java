class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int hayLength = haystack.length();
        if (needleLength > hayLength)
            return -1;
        int iterator = 0;
        for (int i = 0; i < hayLength - needleLength + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(iterator)) {
                boolean flag = true;
                for (int j = i; j < needleLength + i; j++) {
                    if (haystack.charAt(i + iterator) != needle.charAt(iterator)) {
                        flag = false;
                        break;
                    }
                    iterator++;
                }
                if (flag)
                    return i;
                iterator = 0;
            }
        }
        return -1;
    }
}