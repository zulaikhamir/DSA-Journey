//leetcode 901
//The problem is that we have a stock price for each day and we want to find the span of the stock's price for each day. The span of the stock's price on a given day is defined as the maximum number of consecutive days (starting from that day and going backwards) for which the price of the stock was less than or equal to its price on that day.   
//below soln is naive soln and the time complexity is O(n^2) and space complexity is O(1)
//worst case is when the array is sorted in ascending order and we have to check all the previous elements for each element. 

public class StockSpan {//naive solution

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 3, 5, 9, 6, 0, 7};
        for (int i = 0; i < arr.length; i++) {
            int span = 1;
            for (int j = i - 1; j >= 0 && arr[j] <= arr[i]; j--) {
                span++;
            }
            System.out.println(+span);
        }
    }
}


//efficient soln linear time complexity O(n) and space complexity O(n) using stack
//The idea is to use a stack to keep track of the indices of the days. For each day, we pop the indices from the stack until we find a day with a higher stock price. The span for that day is then calculated as the difference between the current index and the index of the last popped element (or -1 if the stack is empty). Finally, we push the current index onto the stack.
//space used is O(n) because we are using a stack to store the indices of the days. In the worst case, all the days could be in increasing order, and we would have to store all the indices in the stack.

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 3, 5, 9, 6, 0, 7};
        int[] span = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        for (int s : span) {
            System.out.println(s);
        }
    }
}