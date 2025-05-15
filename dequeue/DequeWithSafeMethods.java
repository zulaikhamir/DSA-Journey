
import java.util.Deque;
import java.util.LinkedList;

public class DequeWithSafeMethods {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // Insertion at front
        deque.addFirst(10);   // throws exception on capacity-bound queues
        // deque.offerFirst(10);  // returns false if it can't insert (safe)

        // Insertion at rear
        deque.addLast(20);
        // deque.offerLast(20);

        // Peek elements
        System.out.println("Front: " + deque.getFirst()); // throws NoSuchElementException if empty
        // System.out.println("Front: " + deque.peekFirst()); // returns null if empty

        System.out.println("Rear: " + deque.getLast());
        // System.out.println("Rear: " + deque.peekLast());

        // Deletion from front
        deque.removeFirst(); // throws NoSuchElementException if empty
        // deque.pollFirst();  // returns null if empty

        // Deletion from rear
        deque.removeLast();
        // deque.pollLast();

        // Check if empty
        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}
