class Solution {
    public int countPalindromicSubsequence(String s) {
        int firstOccurenceIndex[] = new int[26];
        int lastOccurenceIndex[] = new int[26];
        int strLength = s.length();
        int validPal = 0;

        for (int i = 0; i < 26; i++) {
            firstOccurenceIndex[i] = -1;
            lastOccurenceIndex[i] = -1;
        }

        for (int i = 0; i < strLength; i++) {
            if (firstOccurenceIndex[s.charAt(i) - 'a'] == -1)
                firstOccurenceIndex[s.charAt(i) - 'a'] = i;
            lastOccurenceIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < 26; i++) {
            if (lastOccurenceIndex[i] > firstOccurenceIndex[i] + 1) {
                boolean differentChar[] = new boolean[26];
                for (int j = firstOccurenceIndex[i] + 1; j < lastOccurenceIndex[i]; j++) {
                    differentChar[s.charAt(j) - 'a'] = true;
                }
                int noOfDiffChar = 0;
                for (int j = 0; j < 26; j++) {
                    if (differentChar[j]) {
                        noOfDiffChar++;
                    }
                }
                validPal += noOfDiffChar;
            }
        }
        return validPal;
    }
}
