
import java.util.Stack;

public class QueueUsingTwoStacksDequeueCostly {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation (O(1))
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation (O(n))
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        // Move elements from stack1 to stack2
        while (stack1.size() > 1) {
            stack2.push(stack1.pop());
        }

        // Pop the last inserted element (which is front of queue)
        int result = stack1.pop();

        // Move everything back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return result;
    }

    // Peek operation (O(n))
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        while (stack1.size() > 1) {
            stack2.push(stack1.pop());
        }

        int result = stack1.peek();

        // Move everything back
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return result;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks_DequeueCostly queue = new QueueUsingTwoStacks_DequeueCostly();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.peek());       // 10
        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Front: " + queue.peek());       // 20
    }
}
