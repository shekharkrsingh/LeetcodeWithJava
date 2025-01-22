class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        if (n > m)
            return false;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> ava = new HashMap<>();
        for (int i = 0; i < m; i++) {
            char c = magazine.charAt(i);
            if (map.containsKey(c)) {
                int temp = map.get(c);
                map.put(c, temp + 1);
            } else
                map.put(c, 1);
        }
        for (int i = 0; i < n; i++) {
            char c = ransomNote.charAt(i);
            if (ava.containsKey(c)) {
                int temp = ava.get(c);
                ava.put(c, temp + 1);
            } else
                ava.put(c, 1);
        }
        for (Map.Entry<Character, Integer> a : ava.entrySet()) {
            if (!map.containsKey(a.getKey()))
                return false;
            if (map.get(a.getKey()) < a.getValue())
                return false;
        }
        return true;
    }
}