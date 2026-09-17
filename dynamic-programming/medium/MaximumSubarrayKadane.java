// LeetCode 53 - Maximum Subarray (Kadane's Algorithm)
// https://leetcode.com/problems/maximum-subarray/
// Find the contiguous subarray with the largest sum.
// Approach: at each index, either extend the previous subarray or start fresh from here —
// whichever gives a larger running sum. Track the best sum seen so far.
// Time: O(n), Space: O(1)

public class MaximumSubarrayKadane {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]); // start new or extend
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
