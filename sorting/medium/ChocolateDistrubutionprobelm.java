//Leetcode 1984
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;//we will check the difference between the k-1 th element and the 0th element, then the k th element and the 1st element and so on until we reach the end of the array.
        //why to initialize minDiff to Integer.MAX_VALUE? because we want to find the minimum difference, so we need to initialize it to the maximum possible value so that any difference we find will be smaller than it.
        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
}
