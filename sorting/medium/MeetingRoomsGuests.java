//Leetcode premium question 252. Meeting Rooms
//Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.
//Example 1:
//Input: intervals = [[0,30],[5,10],[15,20]]
//Output: false
//Example 2:
//Input: intervals = [[7,10],[2,4]]
//Output: true
//Time complexity: O(nlogn) where n is the number of intervals. We need to sort the intervals first.
//Space complexity: O(1) if we sort the intervals in place, otherwise O(n) if we create a new array for sorting.
//the idea is to sort the intervals by their start time and then check if there is any overlap between consecutive intervals. If there is an overlap, it means that a person cannot attend all meetings, and we return false. If we finish checking all intervals without finding any overlap, we return true.
// but this problem down which i am gonna write solution for is find how many meetings can a person attend, so we need to count the number of non-overlapping intervals instead of just checking for overlap.
class MeetingRoomsGuests {
    public int maxMeetings(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // Sort the intervals by their end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 1; // At least one meeting can be attended
        int endTime = intervals[0][1]; // End time of the first meeting

        for (int i = 1; i < intervals.length; i++) {
            // If the start time of the current meeting is greater than or equal to the end time of the last attended meeting
            if (intervals[i][0] >= endTime) {
                count++; // Increment the count of meetings that can be attended
                endTime = intervals[i][1]; // Update the end time to the current meeting's end time
            }
        }

        return count; // Return the total number of meetings that can be attended
    }
}
// or else if two two arrays are given array of arrival and array of departure times, we can sort both arrays and then use two pointers to count the number of meetings that can be attended. We can iterate through both arrays and compare the arrival time of the next meeting with the departure time of the last attended meeting. If the arrival time is greater than or equal to the departure time, it means that a person can attend the next meeting, and we increment the count and move the pointer for the departure times. Otherwise, we just move the pointer for the arrival times. This way, we can count the maximum number of meetings that a person can attend without overlapping.
class MeetingRoomsGuests {
    public int maxMeetings(int[] arrival, int[] departure) {
        if (arrival == null || departure == null || arrival.length == 0 || departure.length == 0) {
            return 0;
        }

        // Sort both arrays
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int count = 0; // Count of meetings that can be attended
        int i = 0; // Pointer for arrival times
        int j = 0; // Pointer for departure times

        while (i < arrival.length && j < departure.length) {
            if (arrival[i] >= departure[j]) {
                count++; // Increment the count of meetings that can be attended
                j++; // Move the pointer for departure times
            }
            i++; // Move the pointer for arrival times
        }

        return count; // Return the total number of meetings that can be attended
    }
}
