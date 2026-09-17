// LeetCode 295 - Find Median from Data Stream
// https://leetcode.com/problems/find-median-from-data-stream/
// Support adding numbers one at a time and finding the median of all numbers so far.
// Approach: two heaps — a max-heap for the smaller half, a min-heap for the larger half,
// kept balanced in size (differ by at most 1). Median is derived from the heap tops.
// Time: O(log n) per insert, O(1) for median, Space: O(n)

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {

    static PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder()); // max-heap, lower half
    static PriorityQueue<Integer> large = new PriorityQueue<>(); // min-heap, upper half

    public static void main(String[] args) {
        int[] stream = {5, 15, 1, 3};

        for (int num : stream) {
            addNum(num);
            System.out.println("After adding " + num + ", median = " + findMedian());
        }
    }

    static void addNum(int num) {
        small.offer(num);
        large.offer(small.poll()); // always push through small first, keeps large's min correct

        if (small.size() < large.size()) {
            small.offer(large.poll());
        }
    }

    static double findMedian() {
        if (small.size() > large.size()) {
            return small.peek();
        }
        return (small.peek() + large.peek()) / 2.0;
    }
}
