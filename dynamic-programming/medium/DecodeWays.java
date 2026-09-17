// LeetCode 91 - Decode Ways
// https://leetcode.com/problems/decode-ways/
// A string of digits maps 'A'-'Z' to "1"-"26". Count the number of ways to decode it.
// Approach: bottom-up DP, dp[i] = ways to decode s[0..i). A single digit contributes dp[i-1]
// (if nonzero), a valid two-digit group contributes dp[i-2].
// Time: O(n), Space: O(1)

public class DecodeWays {

    public static void main(String[] args) {
        String s = "226";
        System.out.println("Ways to decode \"" + s + "\": " + numDecodings(s));
    }

    static int numDecodings(String s) {
        if (s == null || s.isEmpty() || s.charAt(0) == '0') return 0;

        int n = s.length();
        int prev2 = 1; // dp[i-2], empty string has 1 way
        int prev1 = 1; // dp[i-1], first char already validated non-zero

        for (int i = 1; i < n; i++) {
            int curr = 0;

            int oneDigit = s.charAt(i) - '0';
            if (oneDigit != 0) {
                curr += prev1;
            }

            int twoDigit = (s.charAt(i - 1) - '0') * 10 + oneDigit;
            if (twoDigit >= 10 && twoDigit <= 26) {
                curr += prev2;
            }

            prev2 = prev1;
            prev1 = curr;

            if (prev1 == 0) return 0; // no valid decoding from here on
        }

        return prev1;
    }
}
