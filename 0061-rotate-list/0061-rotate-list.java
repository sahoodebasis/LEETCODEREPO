/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(k==0){
            return head;
        }
        ListNode slow=head, fast=head;
        ListNode trackFast=null,trackSlow=null,trackNewHead=null;
        int countLen=0;
        ListNode countNodeTrack=head;
        
        while(countNodeTrack!=null){
            countLen++;
            countNodeTrack=countNodeTrack.next;
        }
        
        if(countLen==0 || k%countLen==0  || countLen==1){
            return head;
        }
        
        k= k % countLen;
        
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        
        while(fast!=null){
            trackFast=fast;
            trackSlow=slow;
            slow=slow.next;
            fast=fast.next;
        }
        trackNewHead=slow;
        trackSlow.next=null;
        trackFast.next=head;
        return trackNewHead;
    }
}