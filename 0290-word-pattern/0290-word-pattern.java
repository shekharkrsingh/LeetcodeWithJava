class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        int m = s.length();
        List<String> list = new ArrayList<>();
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) == ' ' && st.length() > 0) {
                list.add(st.toString());
                st = new StringBuilder();
                continue;
            }
            st.append(s.charAt(i));
        }
        if (st.length() > 0)
            list.add(st.toString());
        if (list.size() != n)
            return false;
        for (int i = 0; i < n; i++) {
            char c = pattern.charAt(i);
            String string = list.get(i);
            if ((map1.containsKey(c) && !map1.get(c).equals(string))
                    || (map2.containsKey(string) && c != map2.get(string)))
                return false;
            map1.put(c, string);
            map2.put(string, c);
        }
        return true;

    }
}