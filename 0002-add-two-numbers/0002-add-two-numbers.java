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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode ptr1=l1;
        ListNode ptr2=l2;
        ListNode ans = new ListNode();
        ListNode ansptr=ans;
        while(ptr1!=null && ptr2!=null){
            int add=ptr1.val+ptr2.val+carry;
            if(add>9){
                ansptr.next=new ListNode(add%10);
                carry=add/10;
            }
            else{
                ansptr.next=new ListNode(add);
                carry=0;
            }
            ansptr=ansptr.next;
            ptr1=ptr1.next;
            ptr2=ptr2.next;

        }
        while(ptr1!=null){
            int add=ptr1.val+carry;
            if(add>9){
                ansptr.next=new ListNode(add%10);
                carry=add/10;
            }
            else{
                ansptr.next=new ListNode(add);
                carry=0;
            }
            ptr1=ptr1.next;
            ansptr=ansptr.next;
        }
        while(ptr2!=null ){
            int add=ptr2.val+carry;
            if(add>9){
                ansptr.next=new ListNode(add%10);
                carry=add/10;
            }
            else{
                ansptr.next=new ListNode(add);
                carry=0;
            }

            ptr2=ptr2.next;
            ansptr=ansptr.next;
        }
        if(carry==1){
            ansptr.next=new ListNode(1);
        }
        return ans.next;
    }
}