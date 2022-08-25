class Node:
    def __init__(self, val=None, next=None):
        self.val = val
        self.next = next

class Stack:
    def __init__(self, head=None):
        self.head = head

    # Push a value into the stack
    def push(self, n):
        if self.head is None:
            self.head = Node(n)
            return

        newNode = Node(n)
        newNode.next = self.head
        self.head = newNode

    # Pop the latest inserted value from the stack
    # If stack is empty, return any message
    def pop(self):
        if self.head is None:
            return "Can't pop. Stack is empty."

        temp = self.head
        del self.head
        self.head = temp.next

        return temp.val

    # return the latest value of the stack
    def peek(self):
        return self.head.val

    # Check if stack is empty
    # return True if stack is empty, else False
    def isEmpty(self):
        if self.head is not None:
            return False
        
        return True

    # Prints all of the value(s) in the stack
    def __str__(self):
        curr = self.head
        s = ""

        while curr:
            s += str(curr.val) + " "
            curr = curr.next

        return s

