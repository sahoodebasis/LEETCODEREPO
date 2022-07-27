class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]+nums[i+1]> nums[i+1]){
                nums[i+1]=nums[i]+nums[i+1];
            }
            if(nums[i+1]>max){
                max=nums[i+1];
            }
        }
        return max;
        // return(nums[nums.length-1]);
    }
}