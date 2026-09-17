// LeetCode 90 - Subsets II
// https://leetcode.com/problems/subsets-ii/
// Same as Subsets, but the input array may contain duplicates. Return only unique subsets.
// Approach: sort first, then skip a candidate if it equals the previous one at the same recursion depth.
// Time: O(2^n), Space: O(2^n) for the output

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println("Unique subsets: " + subsetsWithDup(nums));
    }

    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // duplicates become adjacent, so we can skip them
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    static void backtrack(int[] nums, int start, List<Integer> curr, List<List<Integer>> result) {
        result.add(new ArrayList<>(curr));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // skip duplicate at this depth

            curr.add(nums[i]);
            backtrack(nums, i + 1, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}
