class Solution {
    public boolean checkValidCuts(int p, int[][] rectangles) {
        int n = rectangles.length;
        Comparator<int[]> com = new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        };
        Arrays.sort(rectangles, com);
        int count = 0;
        for (int i = 1; i < n; i++)
            if (rectangles[i][0] >= rectangles[i - 1][2])
                count++;
            else
                rectangles[i][2] = Math.max(rectangles[i][2], rectangles[i - 1][2]);
        if (count > 1)
            return true;
        count = 0;
        com = new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        };
        Arrays.sort(rectangles, com);
        for (int i = 1; i < n; i++)
            if (rectangles[i][1] >= rectangles[i - 1][3])
                count++;
            else
                rectangles[i][3] = Math.max(rectangles[i][3], rectangles[i - 1][3]);
        return count > 1;
    }
}