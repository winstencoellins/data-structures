class Node:
    def __init__(self, val=None, next=None):
        self.val = val
        self.next = next

class LinkedList:
    def __init__(self, head=None):
        self.head = head

    # Get the element at certain index, and
    # return the value of the element
    def getElement(self, idx):
        curr = self.head
        i = 0

        while i != idx:
            if curr:
                curr = curr.next
                i += 1
            else:
                return "Index Error: List index out of range."

        return curr.val

    # Search if the element exists in the LinkedList
    # return True if element exist, else False
    def searchElement(self, n):
        curr = self.head

        while curr:
            if curr.val == n:
                return True
            
            curr = curr.next

        return False
    
    # Insert the new element to the front of the LinkedList
    # to achieve O(1) time complexity
    # Can we do an insert back with O(1) time complexity? If so, how?
    def insertFront(self, n):
        if self.head is None:
            self.head = Node(n)
            return

        newNode = Node(n)
        newNode.next = self.head
        self.head = newNode

    # Remove the element from the LinkedList
    def remove(self, n):
        if self.head is None:
            return "Nothing to be removed. LinkedList is empty."

        if self.head.val == n:
            temp = self.head.next
            del self.head
            self.head = temp
            return
        
        prev = self.head
        curr = self.head.next

        while curr:
            if curr.val == n:
                prev.next = curr.next
                temp = curr.next
                del curr
                curr = temp
                return
            
            curr = curr.next
            prev = prev.next

    # Additional function (optional implementation). This is an interview question commonly asked
    # by big tech companies (Google, Facebook, Bloomberg, Amazon). e.g:
    # Your current Linked List: 5 -> 4 -> 3 -> 2 -> 1 -> None
    # After calling the function: 1 -> 2 -> 3 -> 4 -> 5 -> None
    def reverseLinkedList(self):
        prev = None

        while self.head:
            temp = self.head.next
            self.head.next = prev
            prev = self.head
            
            if temp is not None:
                self.head = temp
            else:
                break

    # Print all of the elements in the LinkedList
    def __str__(self):
        curr = self.head
        s = ""

        while curr:
            s += str(curr.val) + " -> "
            curr = curr.next
        
        s += "None"

        return s

l = LinkedList()
l.insertFront(1)
l.insertFront(2)
l.insertFront(3)
l.insertFront(4)
l.insertFront(5)

print(l)

l.reverseLinkedList()

print(l)