class Node:
    def __init__(self, val=None, next=None):
        self.val = val
        self.next = next

class Queue:
    # Note: Utilize the tail pointer to achieve O(1) enqueue
    # time complexity
    def __init__(self, head=None, tail=None):
        self.head = head
        self.tail = tail

    # Insert a value into a queue
    def enqueue(self, n):
        if self.head is None:
            self.head = Node(n)
            self.tail = self.head
            return
        
        newNode = Node(n)
        self.tail.next = newNode
        self.tail = self.tail.next

    # Remove a value from a queue
    def dequeue(self):
        if self.head is None:
            return "Can't dequeue. Queue is empty."

        temp = self.head.next
        del self.head
        
        self.head = temp

    # Check if queue is empty
    def isEmpty(self):
        if self.head is not None:
            return False

        return True

    # Output all of the value(s) in queue
    def __str__(self):
        curr = self.head
        s = ""

        while curr:
            s += str(curr.val) + " "
            curr = curr.next

        return s