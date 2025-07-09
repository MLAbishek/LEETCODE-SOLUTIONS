# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        hashmap={}
        ptr=head
        while(ptr is not None):
            if ptr in hashmap:
                return ptr
            else:
                hashmap[ptr]=1
            ptr=ptr.next
        return None
        