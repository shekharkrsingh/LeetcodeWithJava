class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>i){
                    swap(i, j, j, i, matrix);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n/2){
                    swap(i, j, i, n-j-1, matrix);
                }
            }
        }
    }

    private void swap(int a, int b, int p, int q, int[][]matrix){
        int temp=matrix[a][b];
        matrix[a][b]=matrix[p][q];
        matrix[p][q]=temp;
    }
}