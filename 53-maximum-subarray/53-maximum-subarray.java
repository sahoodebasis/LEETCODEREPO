class Solution {
    public int maxSubArray(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]+nums[i+1]> nums[i+1]){
                nums[i+1]=nums[i]+nums[i+1];
            }
        }
        Arrays.sort(nums);
        return(nums[nums.length-1]);
    }
}