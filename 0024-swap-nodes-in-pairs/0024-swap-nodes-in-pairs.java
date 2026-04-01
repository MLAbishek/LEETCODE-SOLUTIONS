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
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        if(head==null || head.next==null){
            return head;
        }
        while(curr!=null && curr.next!=null){
            ListNode nextn=curr.next;
            ListNode conn = curr.next.next;
            curr.next=null;
            nextn.next=curr;
            if(prev==null){
                head=nextn;
                prev=curr;
                curr=conn;
            }
            else{
                prev.next=nextn;
                prev=curr;
                curr=conn;
            }
            

        }
        if(curr!=null){
            prev.next=curr;
        }
        return head;
    }
}