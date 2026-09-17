// LeetCode 253 - Meeting Rooms II (Premium)
// https://leetcode.com/problems/meeting-rooms-ii/
// Free alternative: https://neetcode.io/problems/meeting-schedule-ii
// Given meeting intervals, find the minimum number of conference rooms required.
// Approach: split start times and end times into two sorted arrays, sweep with two pointers —
// each time a meeting starts before the earliest ongoing meeting ends, we need another room.
// Time: O(n log n), Space: O(n)

import java.util.Arrays;

public class MeetingRoomsII {

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println("Minimum rooms required: " + minMeetingRooms(intervals));
    }

    static int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];

        for (int i = 0; i < n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int rooms = 0, maxRooms = 0;
        int s = 0, e = 0;

        while (s < n) {
            if (starts[s] < ends[e]) {
                rooms++; // a meeting starts before the earliest one ends -> need a new room
                s++;
            } else {
                rooms--; // earliest ongoing meeting has ended -> free up a room
                e++;
            }
            maxRooms = Math.max(maxRooms, rooms);
        }

        return maxRooms;
    }
}
