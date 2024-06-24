class Solution {
    List<List<Integer>> result= new ArrayList<>(); 
   
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> subList= new ArrayList<>();
        
        Arrays.sort(nums); //to make sure the duplicates come together
        subsetFind(nums,subList,0);
        
        return result;
        
    }
    
    public void subsetFind(int [] nums, List<Integer> subList,int index){
        result.add(new ArrayList<>(subList));
        if(subList.size()==nums.length){
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            subList.add(nums[i]);
            subsetFind(nums,subList,i+1);
            subList.remove(subList.size()-1);
        }
    }
}