# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverse(self,prev,curr):
        if(curr==None):
            return prev
        nextnode=curr.next
        curr.next=prev
        return self.reverse(curr,nextnode)
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow=head
        fast=head
        while(fast.next is not None and fast.next.next is not None):
            slow=slow.next
            fast=fast.next.next
        h1=head
        h2=slow.next
        checker=self.reverse(None,h2)
        while(h1 is not None and checker is not None):
            if h1.val==checker.val:
                h1=h1.next
                checker=checker.next
            else:
                return False
        return True




        

        
        
    
        
        