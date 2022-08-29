/*
 * This is a Stack Data Structure implementation using LinkedList
 */
public class Stack {

    static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }

    private Node head;

    // Constructor
    public Stack() {
        this.head = null;
    }

    /*
     * Insert an element into the stack
     */
    public void push(Object n) {
        Node newNode = new Node(n);

        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    /*
     * Remove an element into the stack (LIFO)
     */
    public void pop() {
        if (this.head == null) {
            System.out.println("Cannot pop an element from stack. Stack is empty.");
        } else {            
            this.head = this.head.next;
        }
    }

    /*
     * @return the latest element inside the stack
     */
    public Object peek() {
        return this.head.value;
    }

    /*
     * Check if the stack is empty
     * @return true if it is empty, else false
     */
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }

        return false;
    }

    @Override
    /*
     * Prints all of the value inside stack
     */
    public String toString() {
        Node curr = this.head;
        String s = "";

        while (curr != null) {
            s += curr.value + " ";
            curr = curr.next;
        }

        return s;
    }
}
