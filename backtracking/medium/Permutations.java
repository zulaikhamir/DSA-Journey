// LeetCode 46 - Permutations
// https://leetcode.com/problems/permutations/
// Return all possible permutations of a distinct-integer array.
// Approach: backtracking with a "used" boolean array to track which elements are already placed.
// Time: O(n * n!), Space: O(n!) for the output

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("All permutations: " + permute(nums));
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), result);
        return result;
    }

    static void backtrack(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> result) {
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            curr.add(nums[i]);
            backtrack(nums, used, curr, result);
            curr.remove(curr.size() - 1); // undo
            used[i] = false;
        }
    }
}
