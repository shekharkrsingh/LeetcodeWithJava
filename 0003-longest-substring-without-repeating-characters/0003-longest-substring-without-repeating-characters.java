
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int len = s.length();
        if (len == 0)
            return 0;
        int maxCount = 0;
        int start = 0;
        for (int end = 0; end < len; end++) {
            char currentChar = s.charAt(end);
            if (count.containsKey(currentChar) && count.get(currentChar) >= start)
                start = count.get(currentChar) + 1;
            count.put(currentChar, end);
            maxCount = Math.max(maxCount, end - start + 1);
        }
        return maxCount;
    }
}
