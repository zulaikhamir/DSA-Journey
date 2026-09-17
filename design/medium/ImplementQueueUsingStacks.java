// LeetCode 232 - Implement Queue using Stacks
// https://leetcode.com/problems/implement-queue-using-stacks/
// Note: the mirror-image problem (Stack using Queues) already exists at
// queue/medium/StackUsingOneQueue.java and queue/medium/StackUsingTwoQueues.java.
// Approach: two stacks — "in" for enqueue, "out" for dequeue/peek. Only transfer from
// in -> out when out is empty, which reverses order back to FIFO. Amortized O(1) per op.
// Time: O(1) amortized per operation, Space: O(n)

import java.util.Stack;

public class ImplementQueueUsingStacks {

    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    public static void main(String[] args) {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        queue.push(1);
        queue.push(2);
        System.out.println("Peek: " + queue.peek()); // 1
        System.out.println("Pop: " + queue.pop());   // 1
        System.out.println("Empty: " + queue.empty()); // false
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        moveIfNeeded();
        return out.pop();
    }

    public int peek() {
        moveIfNeeded();
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private void moveIfNeeded() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
}
