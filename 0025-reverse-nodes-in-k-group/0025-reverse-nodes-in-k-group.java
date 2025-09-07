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
    private static ListNode reversedG(ListNode start,ListNode end){
        //end.next=null;
        
        ListNode prev=null;
        ListNode temp=start;
        ListNode stop=end.next;
        while(temp!=stop){
            ListNode nextnode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextnode;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k<=1) return head;
        ListNode answer=new ListNode(0);
        ListNode append=answer;
        ListNode temp=head;
        while(temp!=null){
            ListNode knode=temp;
            for(int i=1;i<k && knode!=null ; i++){
                knode=knode.next;
            }
            if(knode==null)
                break;
            ListNode piv=knode.next;
            ListNode newend=reversedG(temp,knode);
            if(newend!=null){
                append.next=newend;
                append=temp;
                temp=piv;
            }
        }
        append.next = temp;

        return answer.next;

        
    }

}