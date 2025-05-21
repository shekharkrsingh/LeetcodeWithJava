class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] ans;
        int n= matrix.length;
        int m= matrix[0].length;
       ArrayList<Pair<Integer, Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m; j++)
            {
                if(matrix[i][j]==0)
                {
                    list.add(new Pair(i, j));
                }
            }
        }
        int k= list.size();
        for(int i=0;i<k;i++)
        {
           int fst= list.get(i).getKey();
           int scnd= list.get(i).getValue();
           for(int j=0;j<n;j++)
           {
               matrix[j][scnd]=0;
           }
           for(int j=0;j<m;j++)
           {
               matrix[fst][j]=0;
           }
        }

    }
}