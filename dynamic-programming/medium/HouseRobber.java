// LeetCode 198 - House Robber
// https://leetcode.com/problems/house-robber/
// Rob houses in a line for max money, can't rob two adjacent houses.
// Approach: bottom-up DP, dp[i] = max(dp[i-1], dp[i-2] + nums[i]) — either skip house i or take it.
// Time: O(n), Space: O(1)

public class HouseRobber {

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println("Max amount robbed: " + rob(nums));
    }

    static int rob(int[] nums) {
        int prev2 = 0; // best up to i-2
        int prev1 = 0; // best up to i-1

        for (int num : nums) {
            int curr = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
