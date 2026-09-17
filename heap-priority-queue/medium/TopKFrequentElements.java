// LeetCode 347 - Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/
// Return the k most frequent elements in the array.
// Approach: count frequencies with a HashMap, then keep a min-heap of size k ordered by frequency.
// Time: O(n log k), Space: O(n)

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);
        System.out.print("Top " + k + " frequent elements: ");
        for (int n : result) System.out.print(n + " ");
        System.out.println();
    }

    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) freq.merge(num, 1, Integer::sum);

        // min-heap ordered by frequency, evict smallest-frequency entries once size exceeds k
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for (int key : freq.keySet()) {
            pq.offer(key);
            if (pq.size() > k) pq.poll();
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll();
        }
        return result;
    }
}
