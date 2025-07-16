# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast=head
        for _ in range(n):
            fast=fast.next
        slow=head
        if fast==None:
            return head.next
        while(fast.next!=None):
            slow=slow.next
            fast=fast.next

        else:
            slow.next=slow.next.next
            return head




        