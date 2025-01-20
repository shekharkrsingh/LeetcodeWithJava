class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int len = arr.length;
        int[] map = new int[len + 1];
        int result = len;
        for (int i = 0; i < len; i++)
            map[arr[i]] = i;
        for (int i = 0; i < n; i++) {
            int max = -1;
            for (int j = 0; j < m; j++)
                max = Math.max(map[mat[i][j]], max);
            result = Math.min(result, max);
        }
        for (int i = 0; i < m; i++) {
            int max = -1;
            for (int j = 0; j < n; j++)
                max = Math.max(map[mat[j][i]], max);
            result = Math.min(result, max);
        }
        return result;
    }
}