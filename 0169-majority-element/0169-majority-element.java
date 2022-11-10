class Solution {
    public int majorityElement(int[] nums) {
        int count=0, majorElement=nums[0];
        for(int i: nums){
            if(count==0){
                majorElement=i;
                count++;
            }
            else if(i==majorElement){
                count++;
            }
            else{
                count--;
            }
        }
        
        return majorElement;
    }
}