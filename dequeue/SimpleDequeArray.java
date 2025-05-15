
public class SimpleDequeArray {

    int[] arr;
    int size;
    int capacity;

    // Constructor
    public SimpleDequeArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    // Check if deque is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Check if deque is full
    boolean isFull() {
        return size == capacity;
    }

    // Insert at rear (O(1))
    void insertRear(int key) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }
        arr[size] = key;
        size++;
    }

    // Insert at front (O(n) because shifting required)
    void insertFront(int key) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }
        // Shift all elements right
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = key;
        size++;
    }

    // Delete from rear (O(1))
    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        size--;
    }

    // Delete from front (O(n) because shifting required)
    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        // Shift all elements left
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Get front element
    int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[0];
    }

    // Get rear element
    int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[size - 1];
    }

    // Display deque
    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.print("Deque elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        SimpleDequeArray deque = new SimpleDequeArray(5);

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
