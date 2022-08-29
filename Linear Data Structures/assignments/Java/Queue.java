/*
 * This is a Queue Data Structure Implementation Using LinkedList
 */
public class Queue {
    static class Node {
        Object value;
        Node next;

        Node (Object value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    // Constructor
    /*
     * Utilize the tail pointer to achieve O(1) time complexity
     */
    public Queue() {
        this.head = null;
        this.tail = null;
    }

    /*
     * Inserting a value into the queue
     */
    public void enqueue(Object n) {
        // Code here
    }

    /* 
     * Removing a value from the queue using FIFO
     */
    public void dequeue() {
        // Code here
    }

    /*
     * Check if the Queue is empty
     * @return True if the queue is empty, else false
     */
    public boolean isEmpty() {
        return true; // Just a temporary placeholder
    }

    @Override
    /*
     * Printing out all the value in the queue
     */
    public String toString() {
        return "";
    }
}
