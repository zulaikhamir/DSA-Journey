// LeetCode 416 - Partition Equal Subset Sum
// https://leetcode.com/problems/partition-equal-subset-sum/
// Determine if the array can be split into two subsets with equal sum.
// Approach: if total sum is odd, impossible. Otherwise it's a 0/1 knapsack "subset sum" check
// for target = sum/2 — dp[s] = true if some subset sums to exactly s.
// Time: O(n * sum), Space: O(sum)

public class PartitionEqualSubsetSum {

    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        System.out.println("Can partition into equal subsets: " + canPartition(nums));
    }

    static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // sum of 0 is always achievable (empty subset)

        for (int num : nums) {
            // iterate target downwards so each num is used at most once (0/1 knapsack)
            for (int s = target; s >= num; s--) {
                dp[s] = dp[s] || dp[s - num];
            }
        }

        return dp[target];
    }
}
