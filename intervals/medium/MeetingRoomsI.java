// LeetCode 252 - Meeting Rooms (Premium)
// https://leetcode.com/problems/meeting-rooms/
// Free alternative: https://neetcode.io/problems/meeting-schedule
// Given meeting intervals, determine if one person could attend all of them (no overlaps).
// Approach: sort by start time, check each meeting starts at or after the previous one ends.
// Time: O(n log n), Space: O(1) extra (ignoring sort space)

import java.util.Arrays;

public class MeetingRoomsI {

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println("Can attend all meetings: " + canAttendMeetings(intervals));

        int[][] noOverlap = {{7, 10}, {2, 4}};
        System.out.println("Can attend all meetings: " + canAttendMeetings(noOverlap));
    }

    static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false; // overlap with previous meeting
            }
        }
        return true;
    }
}
