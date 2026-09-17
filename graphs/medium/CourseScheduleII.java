// LeetCode 210 - Course Schedule II
// https://leetcode.com/problems/course-schedule-ii/
// Same as Course Schedule, but return a valid order to take all courses (or empty array if impossible).
// Approach: Kahn's algorithm (BFS topological sort) using in-degrees.
// Time: O(V + E), Space: O(V + E)

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleII {

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};

        int[] order = findOrder(numCourses, prerequisites);
        System.out.print("Course order: ");
        for (int course : order) System.out.print(course + " ");
        System.out.println();
    }

    static int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());

        int[] inDegree = new int[numCourses];

        for (int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]); // p[1] -> p[0] (finish p[1] before p[0])
            inDegree[p[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) queue.offer(i);
        }

        int[] order = new int[numCourses];
        int idx = 0;

        while (!queue.isEmpty()) {
            int course = queue.poll();
            order[idx++] = course;

            for (int next : adj.get(course)) {
                inDegree[next]--;
                if (inDegree[next] == 0) queue.offer(next);
            }
        }

        return idx == numCourses ? order : new int[0]; // idx < numCourses means a cycle exists
    }
}
