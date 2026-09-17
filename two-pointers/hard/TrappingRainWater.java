// LeetCode 42 - Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/
// height[i] is the elevation at position i. Compute how much water is trapped after raining.
// Approach: two pointers from both ends, tracking the max height seen from each side.
// Water trapped at a position is bounded by the smaller of the two side-maxes minus its own height.
// Time: O(n), Space: O(1)

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Total trapped water: " + trap(height));
    }

    static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trapped = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                trapped += leftMax - height[left]; // water above this bar, bounded by leftMax
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                trapped += rightMax - height[right];
                right--;
            }
        }

        return trapped;
    }
}
