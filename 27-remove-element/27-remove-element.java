class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0,temp=0;
        while(i<=j && j<nums.length){
            if (nums[j] == val){
                j++;
            }
            else{
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }
        return i;
    }
}