class Solution {
    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        createHappyString(s, n, list);
        if (list.size() < k)
            return "";
        return list.get(k - 1);
    }

    private void createHappyString(StringBuilder s, int n, List<String> list) {
        if (n == 0) {
            list.add(s.toString());
            return;
        }
        char lastChar = s.length() > 0 ? s.charAt(s.length() - 1) : ' ';
        if (lastChar != 'a') {
            s.append('a');
            createHappyString(s, n - 1, list);
            s.deleteCharAt(s.length() - 1);
        }
        if (lastChar != 'b') {
            s.append('b');
            createHappyString(s, n - 1, list);
            s.deleteCharAt(s.length() - 1);
        }
        if (lastChar != 'c') {
            s.append('c');
            createHappyString(s, n - 1, list);
            s.deleteCharAt(s.length() - 1);
        }
    }
}