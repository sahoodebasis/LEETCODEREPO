class Solution {
    public void nextPermutation(int[] nums) {
        
        int i=nums.length-2, j=nums.length-1;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            while(j>=i && nums[i] >=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    
    public void swap(int nums[],int i ,int j ){
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
     public void reverse(int nums[],int i){

         int j=nums.length-1;
         while(i<=j){
         swap(nums,i,j);
         i++;
         j--;
         }
         
     }
}