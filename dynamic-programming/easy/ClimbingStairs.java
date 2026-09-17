// LeetCode 70 - Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/
// n steps, can climb 1 or 2 steps at a time. Count distinct ways to reach the top.
// This is Fibonacci in disguise: ways(n) = ways(n-1) + ways(n-2).
// Approach: bottom-up DP with O(1) space (only need the last two values).
// Time: O(n), Space: O(1)

public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways to climb " + n + " stairs: " + climbStairs(n));
    }

    static int climbStairs(int n) {
        if (n <= 2) return n;

        int prev2 = 1; // ways(1)
        int prev1 = 2; // ways(2)

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
