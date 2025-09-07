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
        int len=0;
        if(head==null)
            return null;
        if(k==0)
            return head;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if(len==1)
            return head;
        k=k%len;
        int stop=Math.abs(len-k);
        System.out.println(stop);
        if(stop==0)
            return head;
        int count=0;
        ListNode p1,p2;
        p1=head;
        for(int i=0;i<stop-1 && p1!=null ;i++){
            p1=p1.next;
        }
        p2=p1.next;
        ListNode newhead=p2;
        p1.next=null;
        if(p2==null)
            return head;
        while(p2.next!=null){
            p2=p2.next;
        }
        p2.next=head;
        return newhead;

    }
}