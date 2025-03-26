class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[m * n];
        int k = 0;
        int rem = -1;
        for (int a[] : grid)
            for (int i : a) {
                arr[k++] = i;
                rem = rem == -1 ? i % x : rem;
                if (rem != (i % x))
                    return -1;
            }
        Arrays.sort(arr);
        int fix = arr.length / 2;
        int val = arr[fix];
        int count = 0;
        for (int l : arr)
            count += (Math.abs(val - l) / x);
        return count;
    }
}