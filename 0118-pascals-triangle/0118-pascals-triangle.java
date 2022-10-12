class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(Arrays.asList(1));
        if(numRows==1){
            return list;
        }
        
        // for(List list1:list){
        //     List<Integer> temp2=innerList(list1);
        //     list.add(temp2);
        // }
        for(int i=1;i<=numRows-1;i++){
            list.add(innerList(list.get(i-1)));
        }
        return list;
    }
    
    public List<Integer> innerList(List<Integer> prevList ){
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<prevList.size()+1;i++){
            if(i==0 || i==prevList.size()){
                temp.add(1);
            }
            else{
                temp.add(prevList.get(i)+prevList.get(i-1));
            }
        }
        return temp;
    }
}