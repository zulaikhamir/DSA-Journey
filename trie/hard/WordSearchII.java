// LeetCode 212 - Word Search II
// https://leetcode.com/problems/word-search-ii/
// Given a board of letters and a list of words, find all words that can be traced through
// adjacent (4-directional) cells without reusing a cell.
// Approach: build a Trie of all target words, then DFS from every board cell, walking the
// Trie alongside the board so shared prefixes across words are explored only once.
// Time: O(rows * cols * 4^L) worst case (L = max word length), Space: O(sum of word lengths)

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null; // set at the node completing a dictionary word
    }

    public static void main(String[] args) {
        char[][] board = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};

        System.out.println("Words found: " + findWords(board, words));
    }

    static List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                if (node.children[idx] == null) node.children[idx] = new TrieNode();
                node = node.children[idx];
            }
            node.word = word;
        }

        List<String> result = new ArrayList<>();
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                dfs(board, r, c, root, result);
            }
        }
        return result;
    }

    static void dfs(char[][] board, int r, int c, TrieNode node, List<String> result) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) return;

        char ch = board[r][c];
        if (ch == '#' || node.children[ch - 'a'] == null) return;

        TrieNode next = node.children[ch - 'a'];
        if (next.word != null) {
            result.add(next.word);
            next.word = null; // avoid duplicate additions if the word is reachable twice
        }

        board[r][c] = '#'; // mark visited

        dfs(board, r + 1, c, next, result);
        dfs(board, r - 1, c, next, result);
        dfs(board, r, c + 1, next, result);
        dfs(board, r, c - 1, next, result);

        board[r][c] = ch; // restore on backtrack
    }
}
