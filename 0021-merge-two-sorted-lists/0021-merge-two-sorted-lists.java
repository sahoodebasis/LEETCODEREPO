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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode resultNode= new ListNode();
        ListNode trackResultNode=resultNode;
        
        while(list1!=null && list2 !=null){
            if(list1.val <=list2.val){
                ListNode temp = new ListNode(list1.val);
                resultNode.next=temp;
                resultNode=temp;
                list1=list1.next;
            }
            else{
                ListNode temp = new ListNode(list2.val);
                resultNode.next=temp;
                resultNode=temp;
                list2=list2.next;
            }
        }
        
        if(list1==null){
            resultNode.next=list2;
        }
        else if(list2==null){
            resultNode.next=list1;
        }
        
        return trackResultNode.next;
    }
}