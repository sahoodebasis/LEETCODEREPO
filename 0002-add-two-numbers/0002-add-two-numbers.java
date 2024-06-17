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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result=new ListNode();
        ListNode trackResult=result;
        int total=0,carry=0;
        while(l1!=null && l2!=null){
            total=l1.val+l2.val+carry;
            if(total>=10){
                carry=1; 
            }
            else{
                    carry=0;
                }
            ListNode temp=new ListNode(total%10);
            result.next=temp;
            result=temp;
            l1=l1.next;
            l2=l2.next;
        }
        
        if(l1==null){
            while(l2!=null){
                 total=l2.val+carry;
                 if(total>=10){
                    carry=1; 
               }
                else{
                    carry=0;
                }
                ListNode temp=new ListNode(total%10);
                result.next=temp;
                result=temp;
                l2=l2.next;
                
                
            }
        }
        
        if(l2==null){
            while(l1!=null){
                 total=l1.val+carry;
                 if(total>=10){
                    carry=1; 
               }
                else{
                    carry=0;
                }
                ListNode temp=new ListNode(total%10);
                result.next=temp;
                result=temp;
                l1=l1.next;
                
                
            }
        }
        if(carry==1){
             ListNode temp=new ListNode(1);
             result.next=temp;
        }
        
        return trackResult.next;
    }
}