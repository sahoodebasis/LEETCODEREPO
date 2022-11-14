class Solution {
    public int uniquePaths(int m, int n) {
     
     int[][] temp=new int[m][n];
        
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i==0 || j==0){
                temp[i][j]=1;
            }
            else{
                temp[i][j]=temp[i-1][j]+temp[i][j-1];
            }
            
        }
    }
        return temp[m-1][n-1];
    }
}