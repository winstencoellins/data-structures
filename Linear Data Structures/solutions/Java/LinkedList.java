public class LinkedList {

    // Node class
    static class Node {
        Object value;
        Node next;

        Node (Object value) {
            this.value = value;
        }
    }

    private Node head;
    
    // Constructor
    public LinkedList() {
        this.head = null;
    }


    /*
     * Get the value of the element at certain index
     * @return value of the index
     */
    public Object getElement(int idx) {
        // Code here
        if (this.head == null) {
            return "LinkedList is empty.";
        }

        Node curr = this.head;
        int i = 0;

        while (curr != null) {
            if (i == idx) {
                return curr.value;
            } else {
                curr = curr.next;
                i++;
            }
        }

        return "Index Error: Index out of range.";
    }


    /*
     * Search if the element exist in the LinkedList
     * @return True if the element exist, else False
     */
    public boolean searchElement(Object n) {
        // Code here
        Node curr = this.head;

        while (curr != null) {
            if (curr.value == n) {
                return true;
            }

            curr = curr.next;
        }

        return false;
    }


    /*
     * Insert the value at the front of the LinkedList
     * Can we do an insert back with O(1) time complexity? If so, how?
     * You are welcome to implement it
     */
    public void insertFront(Object n) {
        Node newNode = new Node(n);

        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }

    }


    /*
     * Remove the element from LinkedList
     */
    public void removeElement(Object n) {
        Node prev = this.head;
        Node curr = this.head.next;

        if (this.head.value == n) {
            this.head = this.head.next;
        } else {
            while (curr != null) {
                if (curr.value == n) {
                    prev.next = curr.next;
                    curr = curr.next;
                    break;
                }

                curr = curr.next;
                prev = prev.next;
            }
        }
    }

    
    /*
     * Additional function (optional implementation). This is an interview question commonly asked
     * by big tech companies (Google, Facebook, Bloomberg, Amazon). e.g:
     * Your current Linked List: 5 -> 4 -> 3 -> 2 -> 1 -> None
     * After calling the function: 1 -> 2 -> 3 -> 4 -> 5 -> None
     */
    public void reverseLinkedList() {
        // Code here
        Node temp;
        Node prev = null;

        while (this.head != null) {
            temp = this.head.next;
            this.head.next = prev;
            prev = this.head;

            if (temp != null) {
                this.head = temp;
            } else {
                break;
            }
        }
        
    }

    @Override
    public String toString() {
        Node curr = this.head;
        String s = "";

        while (curr != null) {
            s += curr.value + " -> ";
            curr = curr.next;
        }

        s += "None";

        return s;
    }
}