class Solution {
    public String reverseWords(String s) {
        String[] st = s.split(" ");
        int n = st.length;
        List<String> str = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (st[i].length() > 0)
                str.add(st[i]);
        n = str.size();
        StringBuilder result = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            result.append(str.get(i));
            if (i != 0)
                result.append(" ");
        }
        return result.toString();
    }
}