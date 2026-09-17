// LeetCode 51 - N-Queens
// https://leetcode.com/problems/n-queens/
// Place n queens on an n x n board so no two attack each other. Count / print all solutions.
// Approach: backtracking row by row, tracking which columns and diagonals are occupied.
// Time: O(n!) worst case, Space: O(n) for the tracking sets + recursion depth

import java.util.HashSet;
import java.util.Set;

public class NQueens {

    static int n;
    static Set<Integer> cols = new HashSet<>();
    static Set<Integer> diag1 = new HashSet<>(); // row - col is constant along a "/" diagonal
    static Set<Integer> diag2 = new HashSet<>(); // row + col is constant along a "\" diagonal
    static int solutionCount = 0;

    public static void main(String[] args) {
        n = 4;
        backtrack(0);
        System.out.println("Number of distinct solutions for " + n + "-Queens: " + solutionCount);
    }

    static void backtrack(int row) {
        if (row == n) {
            solutionCount++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols.contains(col) || diag1.contains(row - col) || diag2.contains(row + col)) {
                continue; // this column/diagonal is already under attack
            }

            cols.add(col);
            diag1.add(row - col);
            diag2.add(row + col);

            backtrack(row + 1);

            cols.remove(col); // undo
            diag1.remove(row - col);
            diag2.remove(row + col);
        }
    }
}
