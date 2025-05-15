
import java.util.*;

public class QueueReversalIterative {

    // Iterative method to reverse a queue
    public static void reverseQueueIterative(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Pop all items from stack back to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Original Queue: " + queue);
        reverseQueueIterative(queue);
        System.out.println("Reversed Queue (Iterative): " + queue);
    }
}
