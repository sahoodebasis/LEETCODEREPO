class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0,fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        } while(slow!=fast);
        
        int head=0,tail=fast ;
        
        while(head!=tail){
            head=nums[head];
            tail=nums[tail];
        }
        return head;
    }
}