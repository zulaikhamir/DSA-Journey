// LeetCode 78 - Subsets
// https://leetcode.com/problems/subsets/
// Return all possible subsets (the power set) of a set of distinct integers.
// Approach: classic backtracking — at each index, choose to include it or not.
// Time: O(2^n), Space: O(2^n) for the output

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("All subsets: " + subsets(nums));
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    static void backtrack(int[] nums, int start, List<Integer> curr, List<List<Integer>> result) {
        result.add(new ArrayList<>(curr)); // snapshot every state, including the empty subset

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(nums, i + 1, curr, result);
            curr.remove(curr.size() - 1); // undo
        }
    }
}
