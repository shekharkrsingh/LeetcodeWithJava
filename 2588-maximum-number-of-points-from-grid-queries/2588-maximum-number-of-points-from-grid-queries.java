class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        Queue<Integer[]> queue = new LinkedList<Integer[]>();
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        int[] query_ans_arr = new int[1000001];

        int[] queries_distinct_sorted = Arrays.stream(queries).distinct().sorted().toArray();

        queue.add(new Integer[] { 0, 0 });

        for (int j = 0; j < queries_distinct_sorted.length; j++) {
            int num = queries_distinct_sorted[j];
            int res = 0;
            Queue<Integer[]> blocked = new LinkedList<Integer[]>();
            while (!queue.isEmpty()) {

                int size = queue.size();

                while (size > 0) {
                    Integer[] cell = queue.poll();
                    size--;
                    int x = cell[0];
                    int y = cell[1];

                    if (grid[x][y] >= num) {
                        if (visited[x][y] == 0)
                            blocked.add(cell);
                        continue;
                    }

                    if (visited[x][y] == 1)
                        continue;

                    visited[x][y] = 1;

                    res++;

                    if (x + 1 < m)
                        queue.add(new Integer[] { x + 1, y });
                    if (y + 1 < n)
                        queue.add(new Integer[] { x, y + 1 });
                    if (x - 1 >= 0)
                        queue.add(new Integer[] { x - 1, y });
                    if (y - 1 >= 0)
                        queue.add(new Integer[] { x, y - 1 });
                }

            }
            queue = blocked;

            query_ans_arr[num] = j - 1 == -1 ? res : query_ans_arr[queries_distinct_sorted[j - 1]] + res;
        }

        int[] res_arr = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res_arr[i] = query_ans_arr[queries[i]];
        }

        return res_arr;

    }
}