
import java.util.ArrayDeque;

public class ArrayDequeAsQueue {

    public static void main(String[] args) {
        // Create ArrayDeque as a queue
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // Enqueue elements (inserting at rear)
        queue.offer(10);//they do not throw exceptions
        queue.offer(20);
        queue.offer(30);

        // Display queue elements
        System.out.println("Queue elements (front to rear):");
        for (int num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Peek front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements (removing from front)
        System.out.println("Dequeued element: " + queue.poll());
        System.out.println("Dequeued element: " + queue.poll());

        // Display remaining queue
        System.out.println("Queue after dequeuing:");
        for (int num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
