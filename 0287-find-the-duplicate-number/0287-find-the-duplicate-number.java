class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0],fast=nums[0];
        
        while(true) {
            slow=nums[slow];
            fast=nums[nums[fast]];
            
            if(slow==fast){
                break;
            }
        }
        
        int head=nums[0],tail=slow;
        while(head !=tail){
            head=nums[head];
            tail=nums[tail];
        }
        
        return head;
    }
}