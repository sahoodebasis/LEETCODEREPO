class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> solList= new ArrayList<>();
        
        for(int i=1;i<=numRows;i++){
            List<Integer> tempList= new ArrayList<>();
            for(int j=1;j<=i;j++){
                
                if(j==1 || j==i){
                    tempList.add(1);
                }
                else{
                    tempList.add(solList.get(i-2).get(j-1)+solList.get(i-2).get(j-2));
                }
            }
            solList.add(tempList);
        }
        
        return solList;
        
    }
}