class Solution {
    public List<String> stringMatching(String[] words) {
        int size = words.length;
        List<String> answer = new ArrayList<>();
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (isSubstring(words[i], words[j])) {
                    answer.add(words[i]);
                }
            }
        }
        Collections.sort(answer);
        ArrayList<String> uniqueAnswer = new ArrayList<>();
        if (answer.size() > 0)
            uniqueAnswer.add(answer.get(0));
        for (int i = 1; i < answer.size(); i++) {
            if (answer.get(i) != answer.get(i - 1))
                uniqueAnswer.add(answer.get(i));
        }
        return uniqueAnswer;
    }

    private boolean isSubstring(String a, String b) {
        int m = a.length();
        int n = b.length();

        for (int i = 0; i <= n - m; i++) {
            boolean found = true;
            for (int j = 0; j < m; j++) {
                if (b.charAt(i + j) != a.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }
}