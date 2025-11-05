
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeArray {

    public static void main(String[] args) {
        // Create ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // Inserting elements at rear
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        // Inserting elements at front
        deque.addFirst(5);
        deque.addFirst(1);

        // Traversing using for-each
        System.out.println("Deque elements:");
        for (int num : deque) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Accessing front and rear elements
        System.out.println("Front element: " + deque.peekFirst());
        System.out.println("Rear element: " + deque.peekLast());

        // Deleting from front and rear
        deque.removeFirst();
        deque.removeLast();

        // Traversing again
        System.out.println("Deque after deletions:");
        for (int num : deque) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Check size
        System.out.println("Size of deque: " + deque.size());
    }
}
