// LeetCode 79 - Word Search
// https://leetcode.com/problems/word-search/
// Given a grid of letters and a word, determine if the word can be traced through
// adjacent (4-directional) cells without reusing a cell.
// Approach: DFS + backtracking from every cell matching the first letter; mark cells
// visited by temporarily overwriting them, then restore on backtrack.
// Time: O(rows * cols * 4^L) where L is the word length, Space: O(L) recursion depth

public class WordSearch {

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        System.out.println("Can find \"ABCCED\": " + exist(board, "ABCCED"));
        System.out.println("Can find \"SEE\": " + exist(board, "SEE"));
        System.out.println("Can find \"ABCB\": " + exist(board, "ABCB"));
    }

    static boolean exist(char[][] board, String word) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (dfs(board, word, r, c, 0)) return true;
            }
        }
        return false;
    }

    static boolean dfs(char[][] board, String word, int r, int c, int idx) {
        if (idx == word.length()) return true; // matched every character

        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != word.charAt(idx)) {
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '#'; // mark visited so we don't reuse this cell

        boolean found = dfs(board, word, r + 1, c, idx + 1)
            || dfs(board, word, r - 1, c, idx + 1)
            || dfs(board, word, r, c + 1, idx + 1)
            || dfs(board, word, r, c - 1, idx + 1);

        board[r][c] = temp; // restore on backtrack

        return found;
    }
}
