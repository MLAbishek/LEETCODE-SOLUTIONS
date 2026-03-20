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
    private static ListNode findk(ListNode temp,int k){
        while(temp!=null && --k >0){
            temp=temp.next;
        }
        return temp;
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kthn=findk(temp,k);
            if(kthn==null){
                 prev.next=temp;
                return head;
            }
            ListNode nextn=kthn.next;
            kthn.next=null;
            reverse(temp);
            if(temp==head){
                head=kthn;
            }

            if(prev!=null){
                prev.next=kthn;
            }
            prev=temp;
            temp=nextn;
        }
        return head;
        
    }
   
}