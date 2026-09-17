// LeetCode 213 - House Robber II
// https://leetcode.com/problems/house-robber-ii/
// Same as House Robber, but houses are arranged in a circle (first and last are adjacent).
// Approach: the answer can't include both house 0 and house n-1, so run the linear
// House Robber DP twice — once excluding the last house, once excluding the first — and take the max.
// Time: O(n), Space: O(1)

public class HouseRobberII {

    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        System.out.println("Max amount robbed (circular): " + rob(nums));
    }

    static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        return Math.max(
            robRange(nums, 0, n - 2),
            robRange(nums, 1, n - 1)
        );
    }

    static int robRange(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;

        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
