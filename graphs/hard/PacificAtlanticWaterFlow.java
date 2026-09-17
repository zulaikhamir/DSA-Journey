// LeetCode 417 - Pacific Atlantic Water Flow
// https://leetcode.com/problems/pacific-atlantic-water-flow/
// Pacific touches top/left edges, Atlantic touches bottom/right edges. Water flows from a cell
// to a neighbor with height <= current height. Find cells from which water can reach both oceans.
// Approach: multi-source BFS/DFS from each ocean's border cells, flowing "uphill" (reverse flow),
// then intersect the two reachable sets.
// Time: O(rows * cols), Space: O(rows * cols)

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {

    static int rows, cols;
    static int[][] heights;

    public static void main(String[] args) {
        heights = new int[][]{
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        };

        List<List<Integer>> result = pacificAtlantic(heights);
        System.out.println("Cells that reach both oceans: " + result);
    }

    static List<List<Integer>> pacificAtlantic(int[][] heights) {
        rows = heights.length;
        cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for (int c = 0; c < cols; c++) {
            dfs(0, c, pacific, Integer.MIN_VALUE);
            dfs(rows - 1, c, atlantic, Integer.MIN_VALUE);
        }
        for (int r = 0; r < rows; r++) {
            dfs(r, 0, pacific, Integer.MIN_VALUE);
            dfs(r, cols - 1, atlantic, Integer.MIN_VALUE);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    result.add(List.of(r, c));
                }
            }
        }
        return result;
    }

    static void dfs(int r, int c, boolean[][] visited, int prevHeight) {
        if (r < 0 || c < 0 || r >= rows || c >= cols || visited[r][c] || heights[r][c] < prevHeight) {
            return;
        }

        visited[r][c] = true;

        dfs(r + 1, c, visited, heights[r][c]);
        dfs(r - 1, c, visited, heights[r][c]);
        dfs(r, c + 1, visited, heights[r][c]);
        dfs(r, c - 1, visited, heights[r][c]);
    }
}
