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
        
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode result = new ListNode(0);
        ListNode finalResult=result;
        int unit=0,carry=0,total=0;
        while(head1!=null && head2 !=null){
            total=head1.val+head2.val+carry;
            if(total >=10){
                unit=total -10;
                carry=1;
            }
            else{
                unit=total;
                carry=0;
            }
            ListNode res = new ListNode(unit);
            result.next=res;
            result=res;
            head1=head1.next;
            head2=head2.next;
        }
        
        if(head1 ==null){
            while(head2 !=null){
                total=head2.val+carry;
            if(total >=10){
                unit=total -10;
                carry=1;
            }
            else{
                unit=total;
                carry=0;
            }
                ListNode res = new ListNode(unit);
                result.next=res;
                result=res;
                head2=head2.next;
            }
        }
        
        if(head2 ==null){
            while(head1 !=null){
                total=head1.val+carry;
            if(total >=10){
                unit=total -10;
                carry=1;
            }
            else{
                unit=total;
                carry=0;
            }
                ListNode res = new ListNode(unit);
                result.next=res;
                result=res;
                head1=head1.next;
            }
        }
        
        if(carry ==1){
            ListNode res = new ListNode(carry);
            result.next=res;
             result=res;
        }
        result.next=null;
        
        return finalResult.next;
        
    }
}





