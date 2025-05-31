class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i=0;i<allowed.length();i++)
            set.add(allowed.charAt(i));
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            for (int j=0;j<words[i].length();j++) {
                if (!set.contains(words[i].charAt(j)))
                    flag = false;
            }
            if (flag)
                count++;
        }
        return count;

    }
}