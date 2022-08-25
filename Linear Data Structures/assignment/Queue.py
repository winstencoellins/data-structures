class Node:
    def __init__(self, val=None, next=None):
        self.val = val
        self.next = next

"""
Note: We will be using LinkedList for Queue Implementation.
"""
class Queue:
    # Note: Utilize the tail pointer to achieve O(1) enqueue
    # time complexity
    def __init__(self, head=None, tail=None):
        self.head = head
        self.tail = tail

    # Insert a value into a queue
    def enqueue(self, n):
        pass

    # Remove a value from a queue
    # If queue is empty return any message
    def dequeue(self):
        pass

    # Check if queue is empty
    def isEmpty(self):
        pass

    # Output all of the value(s) in queue
    def __str__(self):
        return
