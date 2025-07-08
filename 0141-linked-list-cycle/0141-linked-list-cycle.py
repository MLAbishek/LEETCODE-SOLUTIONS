# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        hashmap={}
        temp=head
        while(temp != None):
            if temp not in hashmap:
                hashmap[temp]=1
            else:
                return True
            temp=temp.next
        return False
            
        