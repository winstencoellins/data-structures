class Node:
    def __init__(self, val=None, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class BinarySearchTree:
    def __init__(self, root=None):
        self.root = root

    def insert(self, n):
        if self.root is None:
            self.root = Node(n)
            return

        r = self.root

        while r:
            if r.val > n:
                if r.left is None:
                    r.left = Node(n)
                    break
                else:
                    r = r.left
            else:
                if r.right is None:
                    r.right = Node(n)
                    break
                else:
                    r = r.right

        