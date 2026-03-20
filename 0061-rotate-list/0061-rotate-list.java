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
    private static ListNode findk(ListNode head,int tot,int k){
        while(head.next!=null && --tot >k){
            head=head.next;

        }
        return head;
    }
    private static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextn;
        }
        return prev;
    }
    public ListNode rotateRight(ListNode head, int k) {
        int count=0;
        ListNode ctr=head;
        if(head==null){
            return head;
        }
        while(ctr!=null){
            count++;
            ctr=ctr.next;
        }
        k=k%count;
        ListNode prev=null;
        ListNode temp=head;
        ListNode kth=findk(temp,count,k);
        if(temp==kth && k>=count){
            ListNode ans=reverse(head);
            return ans;
        }
        ListNode nextn=kth.next;
        kth.next=null;
        reverse(temp);
        ListNode shalf=reverse(nextn);
        temp.next=shalf;
        ListNode finall=reverse(kth);
        return finall;
    }
}