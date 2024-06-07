class Solution {
    public int maxSubArray(int[] nums) {
        
        int largestSum=nums[0];
        int currentSum=nums[0];
        
        for(int i=1;i<nums.length;i++) {
            currentSum=Math.max(currentSum+nums[i],nums[i]);
            largestSum=Math.max(currentSum,largestSum);
        }
        
        return largestSum;
    }
}