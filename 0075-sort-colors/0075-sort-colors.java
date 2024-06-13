class Solution {
    public void sortColors(int[] nums) {
        
        int i=0,low=0,high=nums.length-1;
        int temp=0;
        while(i<=high){
            if(nums[i]==0){
                nums[i]=nums[low];
                nums[low]=0;
                i++;
                low++;
            }
            else if (nums[i]==2){
                nums[i]=nums[high];
                nums[high]=2;
                high--;
            }
            else{
                i++;
            }
        }
        
    }
    
}