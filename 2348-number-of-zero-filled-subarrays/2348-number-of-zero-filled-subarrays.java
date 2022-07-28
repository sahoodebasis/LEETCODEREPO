class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int i=0;
        int j=0;
        long count=0;
        while(i<=j && j<nums.length){
            if(nums[j]==0 && nums[i]== nums[j]){
                count+=j-i+1;
                j++;
            }
            else{
                j++;
                i=j;
            }
        }
        return count;
    }
}