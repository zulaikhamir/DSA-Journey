// LeetCode 1143 - Longest Common Subsequence
// https://leetcode.com/problems/longest-common-subsequence/
// Find the length of the longest subsequence common to both strings.
// Approach: 2D bottom-up DP, dp[i][j] = LCS length of text1[0..i) and text2[0..j).
// Time: O(m*n), Space: O(m*n)

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";

        System.out.println("LCS length: " + longestCommonSubsequence(text1, text2));
    }

    static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // matching chars extend the LCS
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // skip one char from either string
                }
            }
        }

        return dp[m][n];
    }
}
