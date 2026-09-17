// LeetCode 155 - Min Stack
// https://leetcode.com/problems/min-stack/
// Design a stack supporting push, pop, top, and retrieving the minimum element, all in O(1).
// Approach: a second stack tracks the running minimum alongside the main stack — push the
// current min onto it every time (or only when a new min is set, either works).
// Time: O(1) for all operations, Space: O(n)

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Min: " + minStack.getMin()); // -3
        minStack.pop();
        System.out.println("Top: " + minStack.top());    // 0
        System.out.println("Min: " + minStack.getMin());  // -2
    }

    public void push(int val) {
        stack.push(val);
        // mirror the running minimum so pop() always keeps both stacks in sync
        minStack.push(minStack.isEmpty() ? val : Math.min(val, minStack.peek()));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
