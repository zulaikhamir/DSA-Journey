
import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        // Create a Queue using ArrayDeque
        Queue<String> queue = new ArrayDeque<>();

        // Add elements
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        // Display front element
        System.out.println("Front element: " + queue.peek()); // Apple

        // Remove element
        System.out.println("Removed: " + queue.poll()); // Apple

        // Display updated front
        System.out.println("Now front: " + queue.peek()); // Banana

        // Size and empty check
        System.out.println("Size: " + queue.size()); // 2
        System.out.println("Is empty? " + queue.isEmpty()); // false
    }
}
