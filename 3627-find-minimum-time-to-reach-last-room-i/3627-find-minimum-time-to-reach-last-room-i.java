import java.util.*;

class Solution {

    private static final int[][] offset = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length;
        int n = moveTime[0].length;
        int[][] result = new int[m][n];
        for (int[] row : result)
            Arrays.fill(row, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[] { 0, 0, 0 });
        result[0][0] = 0;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currTime = curr[0];
            int i = curr[1];
            int j = curr[2];
            if (i == m - 1 && j == n - 1)
                return currTime;
            for (int[] dir : offset) {
                int k = i + dir[0];
                int l = j + dir[1];
                if (k >= 0 && k < m && l >= 0 && l < n) {
                    int wait = Math.max(moveTime[k][l] - currTime, 0);
                    int arrTime = currTime + wait + 1;
                    if (result[k][l] > arrTime) {
                        result[k][l] = arrTime;
                        pq.offer(new int[] { arrTime, k, l });
                    }
                }
            }
        }

        return -1;
    }
}