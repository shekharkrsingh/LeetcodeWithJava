class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)
        return true;
        Map<Integer, ArrayList<Integer>> adj = new HashMap<>();
        for (int[] a : edges) {
            if (!adj.containsKey(a[0])) {
                ArrayList<Integer> list = new ArrayList<>();
                adj.put(a[0], list);
            }
            if (!adj.containsKey(a[1])) {
                ArrayList<Integer> list = new ArrayList<>();
                adj.put(a[1], list);
            }
            adj.get(a[0]).add(a[1]);
            adj.get(a[1]).add(a[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.offer(source);
        visited[source] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            List<Integer> list = adj.get(v);
            for (int a : list) {
                if (!visited[a])
                    q.offer(a);
                visited[a] = true;
            }
        }
        return visited[destination];
    }
}