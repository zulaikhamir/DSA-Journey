// LeetCode 322 - Coin Change
// https://leetcode.com/problems/coin-change/
// Given coin denominations and a target amount, find the fewest coins needed (or -1 if impossible).
// Approach: bottom-up DP, dp[i] = min coins to make amount i. Unbounded knapsack style —
// for each amount, try every coin and take the best.
// Time: O(amount * coins.length), Space: O(amount)

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        System.out.println("Fewest coins for amount " + amount + ": " + coinChange(coins, amount));
    }

    static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // sentinel value larger than any possible answer
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
