
public class SimpleQueue {

    private int[] arr;
    private int rear;
    private int capacity;

    // Constructor
    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        rear = 0; // Points to next insertion index
    }

    // Enqueue: Add at end (O(1))
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        arr[rear++] = item;
    }

    // Dequeue: Remove from front and shift elements left (O(n))
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = arr[0];
        // Shift all elements to the left
        for (int i = 1; i < rear; i++) {
            arr[i - 1] = arr[i];
        }
        rear--;
        return removed;
    }

    // Peek front element (O(1))
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[0];
    }

    // Check if empty (O(1))
    public boolean isEmpty() {
        return rear == 0;
    }

    // Check if full (O(1))
    public boolean isFull() {
        return rear == capacity;
    }

    // Get size (O(1))
    public int size() {
        return rear;
    }

    // Display queue (O(n))
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue(5);

        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.display(); // 5 10 15

        System.out.println("Dequeued: " + q.dequeue()); // 5
        q.display(); // 10 15

        q.enqueue(20);
        q.enqueue(25);
        q.enqueue(30); // Should be full after this
        q.display();

        q.enqueue(35); // Should print "Queue is full"
    }
}
