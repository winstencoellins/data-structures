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
        // Code here
    }

    /*
     * Remove an element into the stack (LIFO)
     */
    public void pop() {
        // Code here
    }

    /*
     * @return the latest element inside the stack
     */
    public Object peek() {
        return this.head; // Just a temporary placeholder
    }

    /*
     * Check if the stack is empty
     * @return true if it is empty, else false
     */
    public boolean isEmpty() {
        return true; // Just a temporary placeholder
    }

    @Override
    /*
     * Prints all of the value inside stack
     */
    public String toString() {
        return ""; // Just a temporary placeholder
    }

}
