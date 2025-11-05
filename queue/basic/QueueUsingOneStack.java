
import java.util.Stack;

public class  {

    private Stack<Integer> stack = new Stack<>();

    // Enqueue is simple (O(1))
    public void enqueue(int x) {
        stack.push(x);
    }

    // Dequeue uses recursion (O(n))
    public int dequeue() {
        if (stack.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        // Pop the top element
        int x = stack.pop();

        // If stack becomes empty, we've found the front
        if (stack.isEmpty()) {
            return x;
        }

        // Recursively dequeue from the rest
        int result = dequeue();

        // Push the current element back after recursion
        stack.push(x);

        return result;
    }

    // Peek: Similar to dequeue but doesn't remove
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int x = stack.pop();

        if (stack.isEmpty()) {
            stack.push(x);  // restore
            return x;
        }

        int result = peek();
        stack.push(x);
        return result;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingOneStack q = new QueueUsingOneStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.peek());       // 10
        System.out.println("Dequeued: " + q.dequeue()); // 10
        System.out.println("Front: " + q.peek());       // 20
    }
}
