class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x)){
                return x;
            }
            else{
                map.put(x,1);
            }
        }
        return 0;
    }
}