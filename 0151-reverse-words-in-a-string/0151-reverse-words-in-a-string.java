class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        List<String> words = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                if (temp.length() > 0) {
                    words.add(temp.toString());
                    temp.setLength(0);
                }
            } else {
                temp.append(s.charAt(i));
            }
        }
        if (temp.length() > 0) {
            words.add(temp.toString());
        }

        Collections.reverse(words);
        return String.join(" ", words);
    }
}