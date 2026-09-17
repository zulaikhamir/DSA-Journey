// Classic 0/1 Knapsack (not on LeetCode)
// https://www.geeksforgeeks.org/dsa/0-1-knapsack-problem-dp-10/
// Given item weights, values, and a capacity, maximize total value without exceeding capacity.
// Each item can be used at most once (0/1, not unbounded).
// Approach: 2D DP, dp[i][w] = best value using first i items with capacity w.
// Time: O(n * capacity), Space: O(n * capacity)

public class ZeroOneKnapsack {

    public static void main(String[] args) {
        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        int capacity = 7;

        System.out.println("Max knapsack value: " + knapsack(weights, values, capacity));
    }

    static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                dp[i][w] = dp[i - 1][w]; // don't take item i-1

                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]); // take it
                }
            }
        }

        return dp[n][capacity];
    }
}
