// LeetCode 62 - Unique Paths
// https://leetcode.com/problems/unique-paths/
// A robot on an m x n grid starts top-left, can only move right or down, ends bottom-right.
// Count the number of unique paths.
// Approach: bottom-up DP, dp[r][c] = dp[r-1][c] + dp[r][c-1]. First row/column are all 1s.
// Time: O(m*n), Space: O(n) using a rolling 1D row

public class UniquePaths {

    public static void main(String[] args) {
        int m = 3, n = 7;
        System.out.println("Unique paths for a " + m + "x" + n + " grid: " + uniquePaths(m, n));
    }

    static int uniquePaths(int m, int n) {
        int[] row = new int[n];
        java.util.Arrays.fill(row, 1); // first row: only one way to reach each cell (move right)

        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                row[c] += row[c - 1]; // row[c] currently holds dp from row above (dp[r-1][c])
            }
        }

        return row[n - 1];
    }
}
