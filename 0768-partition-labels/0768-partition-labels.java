class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] alp = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++)
            alp[s.charAt(i) - 'a'] = i;
        List<Integer> result = new ArrayList<>();
        int maxVal = alp[s.charAt(0) - 'a'];
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, alp[s.charAt(i) - 'a']);
            if (maxVal == i)
                result.add(i + 1);
        }
        int pre = result.get(0);
        System.out.println(result);
        for (int i = 1; i < result.size(); i++) {
            int temp = pre;
            pre = result.get(i);
            result.set(i, result.get(i) - temp);
        }
        return result;
    }
}