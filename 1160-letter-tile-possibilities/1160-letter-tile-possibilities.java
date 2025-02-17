class Solution {
    public int numTilePossibilities(String tiles) {
        int[] map = new int[26];
        int len = tiles.length();
        for (int i = 0; i < len; i++)
            map[tiles.charAt(i) - 'A']++;
        return countPoss(map);
    }

    private int countPoss(int[] map) {
        int poss = 0;
        for (int i = 0; i < 26; i++)
            if (map[i] > 0) {
                poss++;
                map[i]--;
                poss += countPoss(map);
                map[i]++;
            }
        return poss;
    }
}