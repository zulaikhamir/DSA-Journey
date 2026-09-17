// LeetCode 11 - Container With Most Water
// https://leetcode.com/problems/container-with-most-water/
// height[i] is the wall height at position i. Pick two walls that, with the x-axis, form
// a container holding the most water.
// Approach: two pointers from both ends; always move the pointer at the shorter wall inward,
// since keeping the taller wall can never hurt (moving it in can only reduce width without
// possibly increasing the limiting height).
// Time: O(n), Space: O(1)

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max water container area: " + maxArea(height));
    }

    static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, width * minHeight);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
