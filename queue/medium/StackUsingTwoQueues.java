
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {//push costly

    private Queue<Integer> q1 = new LinkedList<>();  // Main queue
    private Queue<Integer> q2 = new LinkedList<>();  // Helper queue

    // Push element to top of stack
    public void push(int x) {
        // Step 1: Add new element to q2
        q2.add(x);

        // Step 2: Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Step 3: Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop element from top of stack
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return q1.remove();
    }

    // Get top element
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return q1.peek();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top());   // 30
        System.out.println("Pop: " + stack.pop());   // 30
        System.out.println("Top: " + stack.top());   // 20
        System.out.println("Pop: " + stack.pop());   // 20
        System.out.println("Is empty? " + stack.isEmpty()); // false
    }
}
