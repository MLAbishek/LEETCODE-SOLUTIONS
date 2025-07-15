# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        length=0
        ptr=head
        
        while(ptr):
            ptr=ptr.next
            length+=1
        pos=length-n
        if length==1 and n==1:
            return
        if pos==0:
            head=head.next
            return head
        length=0
        ptr=head
        while(ptr):
            length+=1
            if(length==pos):
                temp=ptr.next
                ptr.next=temp.next
                del temp
                break
            ptr=ptr.next
        return head

        