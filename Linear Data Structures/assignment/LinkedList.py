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
        pass

    # Search if the element exists in the LinkedList
    # return True if element exist, else False
    def searchElement(self, n):
        pass
    
    # Insert the new element to the front of the LinkedList
    # to achieve O(1) time complexity
    # Can we do an insert back with O(1) time complexity? If so, how?
    # You are welcome to implement it. You can make changes to the constructor as well
    def insertFront(self, n):
        pass

    # Remove the element from the LinkedList
    def remove(self, n):
        pass

    # Print all of the elements in the LinkedList
    def __str__(self):
        return