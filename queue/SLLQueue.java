
public class SLLQueue {

    // Node class for singly linked list
    private static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;   // Points to front of the queue
    private Node rear;    // Points to rear of the queue
    private int size;     // Number of elements in the queue

    // Constructor
    public SLLQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Enqueue: Add at rear (O(1))
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {  // Empty queue
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;// if we don’t maintain rear, enqueue is O(n).
        }
        //If the queue is not empty, the current rear node's next pointer is updated to point to newNode.

//Then, rear is updated to point to newNode, effectively adding it to the end of the queue.
        size++;
    }

    // Dequeue: Remove from front (O(1))
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = front.data;
        front = front.next;
        if (front == null) { // Queue became empty
            rear = null;
        }
        size--;
        return removed;
    }

    // Get front element (O(1))
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    // Get rear element (O(1))
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return rear.data;
    }

    // Get current size (O(1))
    public int getSize() {
        return size;
    }

    // Check if empty (O(1))
    public boolean isEmpty() {
        return size == 0;
    }

    // Display queue elements (O(n))
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        SLLQueue q = new SLLQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // 10 20 30

        System.out.println("Front: " + q.getFront()); // 10
        System.out.println("Rear: " + q.getRear());   // 30
        System.out.println("Dequeued: " + q.dequeue()); // 10
        q.display(); // 20 30

        System.out.println("Size: " + q.getSize()); // 2
    }
}
