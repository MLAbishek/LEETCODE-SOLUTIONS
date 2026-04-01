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
        if(head==null){
            return head;
        }

        while(curr.next!=null && curr.next.next!=null){
            ListNode nextn=curr.next;
            int l=curr.val;
            int r=nextn.val;
            curr.val=r;
            nextn.val=l;
            curr=curr.next.next;
        }
        if(curr.next!=null){
            int l=curr.val;
            int r=curr.next.val;
            curr.val=r;
            curr.next.val=l;
        }
        return head;
    }
}