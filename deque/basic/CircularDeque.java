
public class CircularDeque {

    int[] arr;
    int front, rear, size, capacity;

    // Constructor
    public CircularDeque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Check if deque is full
    boolean isFull() {
        return size == capacity;
    }

    // Check if deque is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Insert at front
    void insertFront(int key) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        // First element
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } // Move front backward circularly
        else {
            front = (front - 1 + capacity) % capacity;
        }

        arr[front] = key;
        size++;
    }

    // Insert at rear
    void insertRear(int key) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        // First element
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } // Move rear forward circularly
        else {
            rear = (rear + 1) % capacity;
        }

        arr[rear] = key;
        size++;
    }

    // Delete from front
    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        // Single element
        if (front == rear) {
            front = -1;
            rear = -1;
        } // Move front forward circularly
        else {
            front = (front + 1) % capacity;
        }

        size--;
    }

    // Delete from rear
    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        // Single element
        if (front == rear) {
            front = -1;
            rear = -1;
        } // Move rear backward circularly
        else {
            rear = (rear - 1 + capacity) % capacity;
        }

        size--;
    }

    // Get front element
    int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[front];
    }

    // Get rear element
    int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[rear];
    }

    // Display deque
    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        int i = front;
        System.out.print("Deque elements: ");
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        CircularDeque deque = new CircularDeque(5);

        deque.insertRear(10);
        deque.insertRear(20);
        deque.insertFront(5);
        deque.insertFront(1);

        deque.display();

        System.out.println("Front: " + deque.getFront());
        System.out.println("Rear: " + deque.getRear());

        deque.deleteFront();
        deque.deleteRear();

        deque.display();
    }
}
