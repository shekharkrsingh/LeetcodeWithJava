class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (int i = n - 1; i >= 0; i--)
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                count++;
            else if (count == 0)
                str.append(s.charAt(i));
            else
                count--;
        return str.reverse().toString();
    }
}