// LeetCode 131 - Palindrome Partitioning
// https://leetcode.com/problems/palindrome-partitioning/
// Partition a string so every substring in the partition is a palindrome. Return all such partitions.
// Approach: backtracking — at each start index, try every prefix that is a palindrome,
// recurse on the remainder.
// Time: O(n * 2^n) worst case, Space: O(n) recursion depth

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {
        String s = "aab";
        System.out.println("Palindrome partitions of \"" + s + "\": " + partition(s));
    }

    static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    static void backtrack(String s, int start, List<String> curr, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String sub = s.substring(start, end);

            if (isPalindrome(sub)) {
                curr.add(sub);
                backtrack(s, end, curr, result);
                curr.remove(curr.size() - 1); // undo
            }
        }
    }

    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
