class Solution {
    public int majorityElement(int[] nums) {
        int count=0,val=nums[0];
        for(Integer x: nums) {
            if(x==val){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                val=x;
                count++;
            }
        }
        
        return val;
    }
}