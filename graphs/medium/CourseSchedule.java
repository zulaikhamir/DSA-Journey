// LeetCode 207 - Course Schedule
// https://leetcode.com/problems/course-schedule/
// n courses, prerequisites[i] = [a, b] means take b before a. Can all courses be finished?
// Equivalent to: does the prerequisite graph contain a cycle?
// Approach: DFS with a 3-state visited array (0 = unvisited, 1 = visiting, 2 = done).
// Time: O(V + E), Space: O(V + E)

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

    static List<List<Integer>> adj;
    static int[] state; // 0 = unvisited, 1 = in current DFS path, 2 = fully processed

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}};

        System.out.println("Can finish all courses: " + canFinish(numCourses, prerequisites));

        int[][] cyclic = {{1, 0}, {0, 1}};
        System.out.println("Can finish (cyclic case): " + canFinish(2, cyclic));
    }

    static boolean canFinish(int numCourses, int[][] prerequisites) {
        adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());

        for (int[] p : prerequisites) {
            adj.get(p[0]).add(p[1]); // course p[0] depends on p[1]
        }

        state = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0 && hasCycle(i)) {
                return false;
            }
        }
        return true;
    }

    static boolean hasCycle(int course) {
        state[course] = 1; // mark as being visited in this DFS path

        for (int dep : adj.get(course)) {
            if (state[dep] == 1) return true; // back edge -> cycle
            if (state[dep] == 0 && hasCycle(dep)) return true;
        }

        state[course] = 2; // fully processed, safe
        return false;
    }
}
