//leetcode 56
//naive solution
//tc:o(n^3)
//sc:o(n)
//the approach is to check every pair of intervals and merge them if they overlap. We repeat this process until no more intervals can be merged. This approach is inefficient because it requires multiple passes through the list of intervals, leading to a time complexity of O(n^3) in the worst case.
class Solution {
    public int[][] merge(int[][] intervals) {

        boolean changed = true;// flag to check if any intervals were merged in the current pass

        while (changed) {
            changed = false;

            for (int i = 0; i < intervals.length; i++) {// iterate through intervals

                if (intervals[i][0] == -1)// skip deleted intervals
                    continue;

                for (int j = i + 1; j < intervals.length; j++) {// compare with subsequent intervals

                    if (intervals[j][0] == -1)
                        continue;

                    // Check overlap
                    if (intervals[i][1] >= intervals[j][0] &&// i overlaps with j
                        intervals[j][1] >= intervals[i][0]) {// j overlaps with i  why are we checking both conditions? because we need to check if i overlaps with j and j overlaps with i. If we only check one condition, we might miss some cases where the intervals overlap in a way that one interval starts before the other ends but ends after the other starts.

                        // Merge into i
                        intervals[i][0] = Math.min(intervals[i][0], intervals[j][0]);
                        intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);

                        // Delete j
                        intervals[j][0] = -1;
                        intervals[j][1] = -1;

                        changed = true;
                    }
                }
            }
        }

        List<int[]> res = new ArrayList<>();

        for (int[] interval : intervals) {
            if (interval[0] != -1) {
                res.add(interval);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}

//optimized solution
//tc:o(nlogn)
//sc:o(n)
//the approach is to first sort the intervals based on the start time. Then we iterate through the sorted intervals and merge them if they overlap. We keep track of the merged intervals in a list and return it at the end.
//The idea is that we need to compare mth interval only with mth-1 interval because we have sorted the intervals based on the start time. If the mth interval overlaps with the mth-1 interval, we merge them and update the end time of the mth-1 interval. If they don't overlap, we add the mth interval to the result list.
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        //break down this code Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        //Arrays.sort is a built-in method in Java that sorts an array. In this case, we are sorting the 2D array 'intervals' based on the first element of each sub-array (the start time of the interval).
        //The second argument is a lambda expression that defines the sorting order. It takes two sub-arrays 'a' and 'b' as input and returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second. In this case, we are comparing the first elements of the sub-arrays (a[0] and b[0]) to determine their order in the sorted array.
        List<int[]> res = new ArrayList<>();// list to store the merged intervals
        int start = intervals[0][0];// initialize the start time of the first interval
        int end = intervals[0][1];// initialize the end time of the first interval
        for(int i=1;i<intervals.length;i++){// iterate through the sorted intervals starting from the second interval
            if(intervals[i][0]<=end){// if the start time of the current interval is less than or equal to the end time of the previous interval, it means they overlap
                end = Math.max(end,intervals[i][1]);// update the end time to the maximum of the current end time and the end time of the current interval
            }else{
                res.add(new int[]{start,end});// if they don't overlap, add the previous interval to the result list
                start = intervals[i][0];// update the start time to the current interval
                end = intervals[i][1];// update the start and end time to the current interval
            }
        }
        res.add(new int[]{start,end});// add the last merged interval to the result list
        return res.toArray(new int[res.size()][]);// convert the result list to a 2D array and return it
    }
}


// The lambda

// (a, b) -> a[0] - b[0]

// is just a shorter way of writing:

// new Comparator<int[]>() {
//     @Override
//     public int compare(int[] a, int[] b) {
//         return a[0] - b[0];
//     }
// }

// So these two are equivalent:

// Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

// and

// Arrays.sort(intervals, new Comparator<int[]>() {
//     @Override
//     public int compare(int[] a, int[] b) {
//         return a[0] - b[0];
//     }
// });

// The lambda is simply a more concise syntax.
// One important improvement

// Using subtraction can overflow if the numbers are very large.

// For example:

// a[0] = Integer.MAX_VALUE
// b[0] = -1

// a[0] - b[0]

// can overflow and produce an incorrect result.

// A safer version is:

// Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

// Integer.compare returns:

// a negative number if a[0] < b[0]
// 0 if they are equal
// a positive number if a[0] > b[0]

// without risking integer overflow.
