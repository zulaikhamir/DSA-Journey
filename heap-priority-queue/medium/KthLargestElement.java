// LeetCode 215 - Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/
// Find the kth largest element (not the kth distinct value) in an unsorted array.
// Approach: min-heap of size k — keep only the k largest seen so far, root is the answer.
// Time: O(n log k), Space: O(k)

import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(k + "th largest element: " + findKthLargest(nums, k));
    }

    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // evict the smallest, keeping only the k largest so far
            }
        }

        return minHeap.peek();
    }
}
