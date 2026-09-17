// LeetCode 435 - Non-overlapping Intervals
// https://leetcode.com/problems/non-overlapping-intervals/
// Find the minimum number of intervals to remove so the rest don't overlap.
// Approach: greedy — sort by end time, keep an interval if it starts at or after the
// last kept interval's end; otherwise it must be removed.
// Time: O(n log n), Space: O(1) extra

import java.util.Arrays;

public class NonOverlappingIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println("Minimum intervals to remove: " + eraseOverlapIntervals(intervals));
    }

    static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]); // sort by end time

        int removals = 0;
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < lastEnd) {
                removals++; // overlaps with the last kept interval, remove this one
            } else {
                lastEnd = intervals[i][1]; // keep it, update the boundary
            }
        }

        return removals;
    }
}
