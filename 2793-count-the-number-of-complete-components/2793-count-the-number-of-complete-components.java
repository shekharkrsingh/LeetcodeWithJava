class Solution {
    class DisjointSet {
        private int n;
        private int toted[];
        private int size[];
        private int parent[];

        DisjointSet(int n) {
            this.n = n;
            this.toted = new int[n];
            this.parent = new int[n];
            this.size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int parentOf(int x) {
            if (x == parent[x])
                return x;
            return parent[x] = parentOf(parent[x]);

        }

        public void dsu(int u, int v) {
            int par_u = parentOf(u);
            int par_v = parentOf(v);
            if (par_u == par_v)
                toted[par_u]++;
            else if (size[par_u] > size[par_v]) {
                parent[par_v] = par_u;
                toted[par_u] += toted[par_v] + 1;
                size[par_u] += size[par_v];
            } else {
                parent[par_u] = par_v;
                toted[par_v] += toted[par_u] + 1;
                size[par_v] += size[par_u];
            }
        }

        private boolean isRoot(int i) {
            return parent[i] == i;
        }

        public boolean isComp(int i) {
            if (!isRoot(i))
                return false;
            int vs = size[i];
            return toted[i] == (vs * (vs - 1)) / 2;
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        DisjointSet ds = new DisjointSet(n);
        for (int i = 0; i < edges.length; i++)
            ds.dsu(edges[i][0], edges[i][1]);
        int ans = 0;
        for (int i = 0; i < n; i++)
            if (ds.isComp(i))
                ans++;
        return ans;
    }
}