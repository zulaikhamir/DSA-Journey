
import java.util.Stack;

public class QueueUsingTwoStacks_EnqueueCostly {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation (O(n))
    public void enqueue(int x) {
        // Move all elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Push the new element to stack1
        stack1.push(x);

        // Move all elements back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Dequeue operation (O(1))
    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return stack1.pop();
    }

    // Peek (get front element)
    public int peek() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return stack1.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks_EnqueueCostly queue = new QueueUsingTwoStacks_EnqueueCostly();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.peek());     // 10
        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Front: " + queue.peek());     // 20
        System.out.println("Dequeued: " + queue.dequeue()); // 20
    }
}
