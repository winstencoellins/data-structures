class Node:
    def __init__(self, val=None, next=None):
        self.val = val
        self.next = next

class Stack:
    def __init__(self, head=None):
        self.head = head

    # Push a value into the stack
    def push(self, n):
        pass

    # Pop the latest inserted value from the stack
    # If stack is empty, return any message
    def pop(self):
        pass

    # return the latest value of the stack
    def peek(self):
        pass

    # Check if stack is empty
    # return True if stack is empty, else False
    def isEmpty(self):
        pass

    # Prints all of the value(s) in the stack
    def __str__(self):
        return
