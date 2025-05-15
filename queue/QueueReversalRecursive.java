
import java.util.*;

public class QueueReversalRecursive {

    // Recursive method to reverse a queue
    public static void reverseQueueRecursive(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        // Remove the front element
        int item = queue.remove();

        // Recurse for the remaining queue
        reverseQueueRecursive(queue);

        // Add the removed item back to the queue
        queue.add(item);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);

        System.out.println("Original Queue: " + queue);
        reverseQueueRecursive(queue);
        System.out.println("Reversed Queue (Recursive): " + queue);
    }
}
