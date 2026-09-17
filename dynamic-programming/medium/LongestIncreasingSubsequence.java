// LeetCode 300 - Longest Increasing Subsequence
// https://leetcode.com/problems/longest-increasing-subsequence/
// Find the length of the longest strictly increasing subsequence.
// Approach shown: O(n^2) DP, dp[i] = length of LIS ending at index i.
// (An O(n log n) patience-sorting/binary-search approach exists but is less intuitive to learn from.)
// Time: O(n^2), Space: O(n)

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Length of LIS: " + lengthOfLIS(nums));
    }

    static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        java.util.Arrays.fill(dp, 1); // every element is an LIS of length 1 by itself

        int maxLen = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }
}
