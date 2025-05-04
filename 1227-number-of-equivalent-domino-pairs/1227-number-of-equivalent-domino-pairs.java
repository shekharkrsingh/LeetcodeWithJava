class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] map = new int[101];
        int res = 0;
        for (int[] d : dominoes) {
            int key = Math.min(d[0], d[1]) * 10 + Math.max(d[0], d[1]);
            res += map[key];
            map[key]++;
        }
        return res;
    }
}