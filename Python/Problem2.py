class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        remainder = 0
        addedListNode = ListNode(0)
        temp = addedListNode
        while(l1 is not None and l2 is not None and remainder != 0):
            added = (l1.val if l1 is not None else 0) + (l2.val if l2 is not None else 0) + remainder
            digit = added % 10
            remainder = added / 10

            newNode = ListNode(digit)
            temp.next = newNode
            temp = temp.next

            l1 = l1.next if l1 is not None else None
            l2 = l2.next if l2 is not None else None

        return addedListNode.next