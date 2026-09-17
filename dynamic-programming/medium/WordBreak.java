// LeetCode 139 - Word Break
// https://leetcode.com/problems/word-break/
// Given a string and a dictionary, determine if the string can be segmented into a
// space-separated sequence of dictionary words.
// Approach: bottom-up DP, dp[i] = true if s[0..i) can be segmented.
// Time: O(n^2) (n = string length, plus substring hashing), Space: O(n)

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");

        System.out.println("Can segment \"" + s + "\": " + wordBreak(s, wordDict));
    }

    static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        int n = s.length();

        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // empty prefix is trivially segmentable

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
