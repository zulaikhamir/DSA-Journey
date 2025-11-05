
import java.util.ArrayDeque;

public class ArrayDequeAsDeque {

    public static void main(String[] args) {
        // Create ArrayDeque as Deque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Inserting at rear
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        // Inserting at front
        deque.addFirst(5);
        deque.addFirst(1);

        // Displaying Deque (front to rear)
        System.out.println("Deque elements (front to rear):");
        for (int num : deque) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Peeking elements
        System.out.println("Front element: " + deque.peekFirst());
        System.out.println("Rear element: " + deque.peekLast());

        // Removing from front
        System.out.println("Removed from front: " + deque.removeFirst());

        // Removing from rear
        System.out.println("Removed from rear: " + deque.removeLast());

        // Displaying Deque after deletions
        System.out.println("Deque after deletions:");
        for (int num : deque) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Checking if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}
