# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        stack=[]
        ptr=head
        while(ptr is not None):
            stack.append(ptr)
            ptr=ptr.next
        
        ptr=head
        while(len(stack)!=0):
            ele=stack.pop()
            print(ele.val)
            if ptr.val==ele.val:
                ptr=ptr.next

            else:
                return False
        return True

        

        
        
    
        
        