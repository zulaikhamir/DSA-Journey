// LeetCode 56 - Merge Intervals
// https://leetcode.com/problems/merge-intervals/
// Given a list of intervals, merge all overlapping ones.
// Approach: sort by start time, then sweep once, extending the last merged interval
// whenever the next interval overlaps with it.
// Time: O(n log n), Space: O(n)
// Note: a naive O(n^3) + a sorted O(n log n) version of this already exist at
// sorting/medium/MergeOverlappingIntervals.java; this is the clean, standalone version
// for the intervals/ pattern folder.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] merged = merge(intervals);
        for (int[] interval : merged) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        System.out.println();
    }

    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int[] curr = intervals[0];
        result.add(curr);

        for (int[] interval : intervals) {
            if (interval[0] <= curr[1]) {
                curr[1] = Math.max(curr[1], interval[1]); // overlap: extend the current interval
            } else {
                curr = interval; // no overlap: start a new merged interval
                result.add(curr);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
