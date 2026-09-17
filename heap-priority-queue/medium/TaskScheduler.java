// LeetCode 621 - Task Scheduler
// https://leetcode.com/problems/task-scheduler/
// Given tasks and a cooldown n between two same tasks, find the minimum time to finish all tasks
// (idle slots allowed).
// Approach: greedily schedule the most frequent remaining task first using a max-heap of counts.
// Time: O(total time * 26 log 26) ~ O(total), Space: O(1) (at most 26 task types)

import java.util.Collections;
import java.util.PriorityQueue;

public class TaskScheduler {

    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;

        System.out.println("Minimum intervals needed: " + leastInterval(tasks, n));
    }

    static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char t : tasks) freq[t - 'A']++;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) {
            if (f > 0) maxHeap.offer(f);
        }

        int time = 0;

        while (!maxHeap.isEmpty()) {
            java.util.List<Integer> cooling = new java.util.ArrayList<>();
            int cycle = n + 1; // one task + n cooldown slots = one full cycle

            for (int i = 0; i < cycle; i++) {
                if (!maxHeap.isEmpty()) {
                    int count = maxHeap.poll();
                    if (count > 1) cooling.add(count - 1); // still has occurrences left
                    time++;
                } else if (!cooling.isEmpty()) {
                    time++; // idle slot, but only needed if work remains after this cycle
                }
            }

            for (int count : cooling) maxHeap.offer(count);
        }

        return time;
    }
}
