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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode prev=new ListNode(0);
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==val){
                if(curr==head){
                    head=head.next;
                    curr=curr.next;
                }
                else{
                    prev.next=curr.next;
                    //prev=curr;
                    curr=curr.next;
                }
            }
            else{
                prev=curr;
                curr=curr.next;
            }
            

        }
        return head;
    }
}