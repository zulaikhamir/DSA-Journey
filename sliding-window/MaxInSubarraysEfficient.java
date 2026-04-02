
import java.util.Deque;
import java.util.LinkedList;

public class MaxInSubarraysEfficient {

    public static void maxInSubarrays(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> deque = new LinkedList<>(); // stores indexes

        for (int i = 0; i < n; i++) {
            // Remove elements out of this window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements in k range as they are useless
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add current element at the back of the deque
            deque.offerLast(i);

            // The element at the front is the largest in current window
            if (i >= k - 1) {
                System.out.print(arr[deque.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 8, 6};
        int k = 3;
        maxInSubarrays(arr, k);
    }
}
