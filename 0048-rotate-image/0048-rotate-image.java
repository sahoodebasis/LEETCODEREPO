class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int temp=Integer.MAX_VALUE;
        int low;
        int high;
        
        for(int i=0;i<m;i++) {
            for(int j=i;j<n;j++) {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
     
        
        for(int row=0;row<m;row++){
            low=0;
            high=n-1;
        while(low < high) {
            temp=matrix[row][low];
            matrix[row][low]=matrix[row][high];
            matrix[row][high]=temp;
            low++;
            high--;;
        }
        }
    }
}