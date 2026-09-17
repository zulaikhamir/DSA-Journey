// LeetCode 55 - Jump Game
// https://leetcode.com/problems/jump-game/
// Each element is the max jump length from that position. Determine if you can reach the last index.
// Approach: greedily track the farthest reachable index; if the current index ever exceeds
// that reach, we're stuck.
// Time: O(n), Space: O(1)

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Can reach last index: " + canJump(nums));

        int[] stuck = {3, 2, 1, 0, 4};
        System.out.println("Can reach last index: " + canJump(stuck));
    }

    static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false; // this index is unreachable

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}
