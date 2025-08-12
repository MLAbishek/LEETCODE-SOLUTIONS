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
    private static ListNode merge(ListNode left, ListNode right){
        ListNode temphead = new ListNode();
        ListNode ptr=temphead;
        ListNode leftptr=left;
        ListNode rightptr=right;
        while(leftptr!=null && rightptr!=null){
            if(leftptr.val<=rightptr.val){
                ptr.next=new ListNode(leftptr.val);
                leftptr=leftptr.next;
                ptr=ptr.next;
            }
            else{
                ptr.next=new ListNode(rightptr.val);
                rightptr=rightptr.next;
                ptr=ptr.next;
            }
        }
        while(leftptr != null){
            ptr.next=new ListNode(leftptr.val);
            ptr=ptr.next;
            leftptr=leftptr.next;
        }
        while(rightptr != null){
            ptr.next=new ListNode(rightptr.val);
            ptr=ptr.next;
            rightptr=rightptr.next;
        }
        return temphead.next;

    }
    private static ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private static ListNode Divide(ListNode head){
        if(head.next==null){
            return head;
        }
        ListNode mid=middle(head);
        ListNode right=Divide(mid.next);
        mid.next=null;
        ListNode left=Divide(head);
        return merge(left,right);

    }
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        return Divide(head);
    }
}