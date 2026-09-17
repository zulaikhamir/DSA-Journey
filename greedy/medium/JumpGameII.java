// LeetCode 45 - Jump Game II
// https://leetcode.com/problems/jump-game-ii/
// Same setup as Jump Game, but find the minimum number of jumps to reach the last index
// (guaranteed reachable).
// Approach: greedy BFS-like level tracking — expand the reachable window one "jump" at a time.
// Time: O(n), Space: O(1)

public class JumpGameII {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps: " + jump(nums));
    }

    static int jump(int[] nums) {
        int jumps = 0;
        int currEnd = 0;     // farthest index reachable with jumps taken so far
        int farthest = 0;    // farthest index reachable with one more jump

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currEnd) {
                jumps++;
                currEnd = farthest; // commit to the best jump found in this range
            }
        }

        return jumps;
    }
}
