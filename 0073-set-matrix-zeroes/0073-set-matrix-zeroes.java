class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m= matrix[0].length;
        Set<Integer> row= new HashSet<>();
        Set<Integer> col= new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    if(!row.contains(i)){
                        row.add(i);
                    }
                    if(!col.contains(j)){
                        col.add(j);
                    }
                }
            }
        }
        row.stream().forEach(it-> {
           for(int i=0;i<m;i++){
                matrix[it][i]=0;
            } 
        });
        col.stream().forEach(it-> {
           for(int i=0;i<n;i++){
                matrix[i][it]=0;
            } 
        });
    }
}