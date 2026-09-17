// LeetCode 15 - 3Sum
// https://leetcode.com/problems/3sum/
// Find all unique triplets in the array that sum to zero.
// Approach: sort first, fix one element, then two-pointer scan the rest — skipping duplicates
// at every level to avoid repeated triplets.
// Note: different from searching/medium/TripletSumSorted.java, which only checks existence
// of a triplet for a fixed target rather than returning all unique zero-sum triplets.
// Time: O(n^2), Space: O(n) for sorting + output

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println("Unique triplets summing to zero: " + threeSum(nums));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate first element

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++; // skip duplicates
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
