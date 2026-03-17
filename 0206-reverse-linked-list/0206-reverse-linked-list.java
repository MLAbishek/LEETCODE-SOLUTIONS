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
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextn=curr.next;
        while(curr!=null){
            nextn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextn;
            
        }
        return prev;
    }
}