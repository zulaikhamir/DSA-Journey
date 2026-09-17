//leetcode 496
//The problem is that we have an array of integers and we want to find the previous greater element for each element in the array.
// The previous greater element for an element x is the first greater element on the left side of x in the array.
// If there is no greater element, we print -1.

//below soln is a niave solution and the time complexity is O(n^2) and space complexity is O(1)
public class PreviousGreaterElement {

    public static void main(String[] args) {//naive solution
        int[] arr = {1, 2, 5, 7, 3, 5, 9, 6, 0, 7};
        int j;
        for (int i = 0; i < arr.length; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.println(+arr[j]);
                    break;
                }

            }
            if (j == -1) {
                System.out.println(-1);
            }

        }

    }
}


//efficient soln linear time complexity O(n) and space complexity O(n) using stack
//The idea is to use a stack to keep track of the elements. For each element,
// we pop the elements from the stack until we find a greater element. 
// The previous greater element for that element is then the top element of the stack (or -1 if the stack is empty).
//  Finally, we push the current element onto the stack.
//space used is O(n) because we are using a stack to store the elements.
//  In the worst case, all the elements could be in decreasing order, and we would have to store all the elements in the stack.

//below is the efficient solution using stack
public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 3, 5, 9, 6, 0, 7};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            System.out.println(stack.isEmpty() ? -1 : stack.peek());
            stack.push(arr[i]);
        }
    }
}