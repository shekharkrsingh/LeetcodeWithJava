class Solution {
    public int magnificentSets(int n, int[][] edges) {
        int[][] mat = new int[n+1][n+1];
        for(int[] e: edges) {
            mat[e[0]][e[1]] = 1;
            mat[e[1]][e[0]] = 1;
        }
        int[] visited = new int[n+1];
        int[] color = new int[n+1];
        Arrays.fill(color, -1);
        for(int i=1;i<mat.length;i++){
            //check if graph is bipartite
            if(color[i] == -1){
                color[i] = 1;
                Queue<Integer> q = new LinkedList();
                q.add(i);
                while(!q.isEmpty()){
                    int len = q.size();
                    while(len-->0){
                        int current = q.remove();
                        for(int j=0;j<mat[0].length;j++){
                            if(mat[current][j] == 1 && color[j] == -1) {
                                color[j] = (color[current]+1)%2;
                                q.add(j);
                            } else if(mat[current][j] == 1 && color[j] != (color[current]+1)%2){
                                return -1;
                            }
                        }
                    }
                }
            }
        }
        Arrays.fill(color, -1);
        int col = 0;
        HashMap<Integer, Set<Integer>> m = new HashMap();
        for(int i=1;i<mat.length;i++){
            //check if graph is bipartite
            if(color[i] == -1){
                color[i] = col;
                Queue<Integer> q = new LinkedList();
                q.add(i);
                while(!q.isEmpty()){
                    int len = q.size();
                    while(len-->0){
                        int current = q.remove();
                        m.computeIfAbsent(col, key -> new HashSet<>()).add(current);  
                        for(int j=0;j<mat[0].length;j++){
                            if(mat[current][j] == 1 && color[j] == -1) {
                                color[j] = col;
                                q.add(j);
                            }
                        }
                    }
                }
                col++;
            }
        }
        int fans = 0;
        for(Set<Integer> s: m.values()){
            int max = 0;
            for(int i: s) {
                int ans = 0;
                Arrays.fill(visited, 0);
                if(visited[i] == 0) {
                    visited[i] = 1;
                    Queue<Integer> q = new LinkedList();
                    q.add(i);
                    while(!q.isEmpty()){
                        int len = q.size();
                        while(len-->0){
                            int current = q.remove();
                            for(int j=0;j<mat[0].length;j++){
                                if(mat[current][j] == 1 && visited[j] == 0) {
                                    visited[j] = 1;
                                    q.add(j);
                                }
                            }
                        }
                        ans++;
                    }
                }
                max = Math.max(ans, max);
            }
            fans += max;
        }
        return fans;
    }
}