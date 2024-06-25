class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> subList= new ArrayList<>();
        findCandidates(candidates,subList,target,0);
        return ans;
    }
    
    public void findCandidates(int [] candidates, List<Integer> subList, int target, int index){
        // if(subList.stream().mapToInt(Integer::intValue).sum()==target){
        //     ans.add(new ArrayList<>(subList));
        //     return;
        // }
        if(target<0){
            return;
        }
        else if(target==0){
            ans.add(new ArrayList<>(subList));
        }
        else{
            for(int i=index;i<candidates.length;i++){
                subList.add(candidates[i]);
                findCandidates(candidates,subList,target-candidates[i],i); //semding i as same element can be reused again 
                subList.remove(subList.size()-1);
            }
        }
        
        
    }
}