// LeetCode 72 - Edit Distance
// https://leetcode.com/problems/edit-distance/
// Minimum number of insert/delete/replace operations to convert word1 into word2.
// Approach: 2D DP, dp[i][j] = edit distance between word1[0..i) and word2[0..j).
// Time: O(m*n), Space: O(m*n)

public class EditDistance {

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";

        System.out.println("Edit distance: " + minDistance(word1, word2));
    }

    static int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) dp[i][0] = i; // delete all i chars from word1
        for (int j = 0; j <= n; j++) dp[0][j] = j; // insert all j chars into word1

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // chars match, no operation needed
                } else {
                    dp[i][j] = 1 + Math.min(
                        dp[i - 1][j - 1], // replace
                        Math.min(dp[i - 1][j], dp[i][j - 1]) // delete, insert
                    );
                }
            }
        }

        return dp[m][n];
    }
}
