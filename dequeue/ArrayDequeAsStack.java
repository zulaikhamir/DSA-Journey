
import java.util.ArrayDeque;

public class ArrayDequeAsStack {

    public static void main(String[] args) {
        // Create an ArrayDeque as a stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Push elements (like stack's push)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display stack elements
        System.out.println("Stack elements (top to bottom):");
        for (int num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Display remaining stack
        System.out.println("Stack after popping:");
        for (int num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
