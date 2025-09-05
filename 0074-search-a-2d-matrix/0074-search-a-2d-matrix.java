class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length;
        int m=matrix[0].length;
        int first=m-1;
        int second=0;
        while(first>=0 && second<n){
            if(matrix[second][first]==target){
                return true;
            }
            if(matrix[second][first]<target){
                second++;
                continue;
            }
            first--;
        }
        return false;
    }
}