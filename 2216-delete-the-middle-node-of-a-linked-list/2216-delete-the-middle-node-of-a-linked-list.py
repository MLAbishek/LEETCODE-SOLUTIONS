# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        ptr=head
        length=0
        if(head.next == None):
            return 
        while(ptr!=None):
            ptr=ptr.next
            length+=1
        
        if(length%2==0):
            slow=head
            fast=head
            while(fast.next != None and fast.next.next != None):
                slow=slow.next
                fast=fast.next.next
            temp=slow.next
            slow.next=temp.next
            del temp
            return head
        else:
            slow=head
            fast=head
            while(fast.next != None and fast.next.next != None and fast.next.next.next != None):
                slow=slow.next
                fast=fast.next.next
            temp=slow.next
            slow.next=temp.next
            del temp
            return head

        