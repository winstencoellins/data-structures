public class LinkedList {
    
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
        return this.head.value; // Just a temporary placeholder
    }

    
    /*
     * Search if the element exist in the LinkedList
     * @return True if the element exist, else False
     */
    public boolean searchElement(Object n) {
        // Code here
        return true; // Just a temporary placeholder
    }

    /*
     * Insert the value at the front of the LinkedList
     * Can we do an insert back with O(1) time complexity? If so, how?
     * You are welcome to implement it
     */
    public void insertFront(Object n) {
        // Code here
    }


    /*
     * Remove the element from LinkedList
     */
    public void removeElement(Object n) {
        // Code here
    }


    /*
     * Additional function (optional implementation). This is an interview question commonly asked
     * by big tech companies (Google, Facebook, Bloomberg, Amazon). e.g:
     * Your current Linked List: 5 -> 4 -> 3 -> 2 -> 1 -> None
     * After calling the function: 1 -> 2 -> 3 -> 4 -> 5 -> None
     */
    public void reverseLinkedList() {
        // Code here
    }

    @Override
    /*
     * Printing out all of the value in the LinkedList
     */
    public String toString() {
        // Code here
        return ""; // Just a temporary placeholder
    }
}