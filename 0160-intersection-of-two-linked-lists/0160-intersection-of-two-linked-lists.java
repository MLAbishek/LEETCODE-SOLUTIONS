/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode ptra=headA;
        ListNode ptrb=headB;
        while(ptra!=null){
            map.put(ptra,1);
            ptra=ptra.next;
        }
        while(ptrb!=null){
            if(map.containsKey(ptrb)){
                return ptrb;
            }
            map.put(ptrb,1);
            ptrb=ptrb.next;
        }
        return null;
    }
}