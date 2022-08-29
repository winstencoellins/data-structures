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
    public Queue () {
        this.head = null;
        this.tail = null;
    }

    /*
     * Inserting a value into the queue
     */
    public void enqueue (Object n) {
        // Code here
        Node newNode = new Node(n);

        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }
    }

    /* 
     * Removing a value from the queue using FIFO
     */
    public void dequeue () {
        // Code here
        if (this.head == null) {
            System.out.println("Nothing to dequeue. Queue is empty.");
        } else {
            this.head = this.head.next;
        }
    }

    /*
     * Check if the Queue is empty
     * @return True if the queue is empty, else false
     */
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        
        return false; // Just a temporary placeholder
    }

    @Override
    /*
     * Printing out all the value in the queue
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
