# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None :
            return
        if head.next is None:
            return head
        prev=head
        curr=head.next
        nextnode=head.next.next
        prev.next=None

        while(nextnode is not None):
            curr.next=prev 
            prev=curr
            curr=nextnode
            nextnode=nextnode.next
        curr.next=prev
        return curr
        

        