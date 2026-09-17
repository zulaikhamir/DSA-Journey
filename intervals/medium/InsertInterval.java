// LeetCode 57 - Insert Interval
// https://leetcode.com/problems/insert-interval/
// Given a sorted, non-overlapping list of intervals and a new interval, insert it and merge
// as needed so the list stays sorted and non-overlapping.
// Approach: sweep once — add intervals ending before the new one, merge overlapping ones
// into it, then add remaining intervals.
// Time: O(n), Space: O(n)

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        int[][] result = insert(intervals, newInterval);
        for (int[] interval : result) {
            System.out.print(java.util.Arrays.toString(interval) + " ");
        }
        System.out.println();
    }

    static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0, n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i++]); // entirely before newInterval
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++; // overlaps, absorb into newInterval
        }
        result.add(newInterval);

        while (i < n) {
            result.add(intervals[i++]); // entirely after newInterval
        }

        return result.toArray(new int[result.size()][]);
    }
}
