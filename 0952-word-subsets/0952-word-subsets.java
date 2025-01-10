class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int count[] = new int[26];
        List<String> universal = new ArrayList<>();
        int m = words2.length;
        int n = words1.length;
        for (int i = 0; i < m; i++) {
            int[] maxCount = new int[26];
            int len = words2[i].length();
            String str = words2[i];
            for (int j = 0; j < len; j++) {
                maxCount[str.charAt(j) - 'a']++;
                count[str.charAt(j) - 'a'] = Math.max(maxCount[str.charAt(j) - 'a'], count[str.charAt(j) - 'a']);
            }
        }
        for (int i = 0; i < n; i++) {
            int occ[] = new int[26];
            int len = words1[i].length();
            String str = words1[i];
            for (int j = 0; j < len; j++)
                occ[str.charAt(j) - 'a']++;
            boolean flag = true;
            for (int j = 0; j < 26; j++)
                if (count[j] > occ[j])
                    flag = false;
            if (flag)
                universal.add(words1[i]);
        }

        return universal;
    }
}