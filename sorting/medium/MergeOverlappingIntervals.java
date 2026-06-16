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
        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end = Math.max(end,intervals[i][1]);
            }else{
                res.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][]);
    }
}
