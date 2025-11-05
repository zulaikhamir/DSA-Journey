
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {

    private Queue<Integer> q = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        q.add(x);
        int size = q.size();
        // Rotate the queue to place the new element at the front
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }

    // Pop the top element
    public int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return q.remove();
    }

    // Peek the top element
    public int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return q.peek();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q.isEmpty();
    }

    // Size of the stack
    public int size() {
        return q.size();
    }

    public static void main(String[] args) {
        StackUsingOneQueue stack = new StackUsingOneQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.top());   // 30
        System.out.println("Pop: " + stack.pop());   // 30
        System.out.println("Top: " + stack.top());   // 20
        System.out.println("Size: " + stack.size()); // 2
    }
}
