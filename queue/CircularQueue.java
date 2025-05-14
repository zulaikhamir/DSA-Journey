
public class CircularQueue {

    private int[] arr;
    private int front;   // Index of front element
    private int rear;    // Index of next insertion
    private int size;    // Current number of elements
    private int capacity;

    // Constructor
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    // Enqueue: Add at rear (O(1))
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        arr[rear] = item;
        rear = (rear + 1) % capacity;
        size++;
    }

    // Dequeue: Remove from front (O(1))
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = arr[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    // Peek: View front element (O(1))
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    // ✅ Get rear element (last inserted)
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        // rear points to next insertion index, so last element is at (rear - 1 + capacity) % capacity
        return arr[(rear - 1 + capacity) % capacity];
    }

    // Check if empty (O(1))
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if full (O(1))
    public boolean isFull() {
        return size == capacity;
    }

    // Get current size (O(1))
    public int size() {
        return size;
    }

    // Display the queue (O(n))
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display(); // 1 2 3 4 5

        System.out.println("Dequeued: " + q.dequeue()); // 1
        q.enqueue(6); // wraps around
        q.display(); // 2 3 4 5 6

        System.out.println("Front element: " + q.peek());     // 2
        System.out.println("Rear element: " + q.getRear());   // 6
    }
}
// rear - 1: Gets the index of the last element added.

// + capacity: Prevents negative index if rear = 0.

// % capacity: Ensures circular wrap-around.
