class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int countRow=0,n= matrix[0].length;
        int i=0;
        for(;i<matrix.length-1;i++){
            if(target>=matrix[i][0] && target < matrix[i+1][0]){
                countRow=i;
                break;
            }
            
        }
        if(i==matrix.length-1){
        if(target>=matrix[i][0] && target <= matrix[i][n-1]){
                countRow=i;
            }
        }
        
        for(int j=0;j<n;j++){
            if(target==matrix[countRow][j]){
                return true;
            }
        }
        return false;
    }
}