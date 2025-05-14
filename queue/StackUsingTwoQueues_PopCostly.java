
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues_PopCostly {

    private Queue<Integer> q1 = new LinkedList<>();  // Main queue
    private Queue<Integer> q2 = new LinkedList<>();  // Helper queue

    // Push element to top of stack (O(1))
    public void push(int x) {
        q1.add(x);
    }

    // Pop element from top of stack (O(n))
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        // Move elements from q1 to q2, leaving last element behind
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // The last remaining element in q1 is the top of the stack
        int popped = q1.remove();

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    // Get top element (O(n))
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        // Move elements from q1 to q2, leaving last element to peek
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove();
        q2.add(top); // put it back after peeking

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingTwoQueues_PopCostly stack = new StackUsingTwoQueues_PopCostly();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Top: " + stack.top());   // 300
        System.out.println("Pop: " + stack.pop());   // 300
        System.out.println("Top: " + stack.top());   // 200
        System.out.println("Is Empty? " + stack.isEmpty()); // false
    }
}
