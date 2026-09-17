// LeetCode 39 - Combination Sum
// https://leetcode.com/problems/combination-sum/
// Given distinct candidates and a target, find all unique combinations that sum to target.
// Each candidate can be reused an unlimited number of times.
// Approach: backtracking; pass the same index (not i+1) into recursion to allow reuse.
// Time: O(2^target) worst case, Space: O(target) recursion depth

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        System.out.println("Combinations summing to " + target + ": " + combinationSum(candidates, target));
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    static void backtrack(int[] candidates, int remain, int start, List<Integer> curr, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (remain < 0) return;

        for (int i = start; i < candidates.length; i++) {
            curr.add(candidates[i]);
            backtrack(candidates, remain - candidates[i], i, curr, result); // i, not i+1: reuse allowed
            curr.remove(curr.size() - 1);
        }
    }
}
