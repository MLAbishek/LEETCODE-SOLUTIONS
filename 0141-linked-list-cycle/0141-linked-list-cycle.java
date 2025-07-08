/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        if(head == null) return false;
        HashMap<ListNode,Integer> hmap = new HashMap<>();
        while(temp != null){
            if(!hmap.containsKey(temp)){
                hmap.put(temp,1);
            }
            else{
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}