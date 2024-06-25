class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subList= new ArrayList<>();
        
        findSubsets(nums,subList,0);

        return ans;
        
    }
    
    public void findSubsets(int [] nums, List<Integer> subList, int index){
        ans.add(new ArrayList<>(subList));
        
        if(index>=nums.length){//index>nums.length //nums.length==subList.size()
            return;
        }
        
        for(int i=index;i<nums.length;i++){
            subList.add(nums[i]);
            findSubsets(nums,subList,i+1);
            subList.remove(subList.size()-1);
        }
    }
}