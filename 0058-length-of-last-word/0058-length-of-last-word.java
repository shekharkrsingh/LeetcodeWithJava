class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int len = s.length();
        boolean flag = false;
        for (int i = len - 1; i >= 0; i--) {
            if (!flag && s.charAt(i) == ' ')
                continue;
            flag = true;
            if (s.charAt(i) == ' ')
                return count;
            else
                count++;
        }
        return count;
    }
}