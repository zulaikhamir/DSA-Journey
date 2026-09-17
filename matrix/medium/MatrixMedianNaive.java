//matrix median naive approach
//this problem is to find the median of a matrix. The median is the middle value in a sorted list of numbers.
//  If the list has an even number of elements, the median is the average of the two middle values. 
// In this case, we are given a 2D matrix and we need to find its median. 
// The naive approach is to flatten the matrix into a 1D array, sort it, and then return the middle element
//  (or the average of the two middle elements if the total number of elements is even).
//example: if the matrix is:
// 1 3 5
// 2 6 9
// 3 6 9
// The flattened array will be: [1, 3, 5, 2, 6, 9, 3, 6, 9]
// After sorting, the array will be: [1, 2, 3, 3, 5, 6, 6, 9, 9]
// The median will be the middle element, which is 5 in this case.

import java.util.Arrays;

public class MatrixMedianNaive {

    public static int findMedian(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] flat = new int[n * m];
        int index = 0;

        // Flatten the matrix
        for (int[] row : matrix) {
            for (int val : row) {
                flat[index++] = val;
            }
        }

        // Sort the array
        Arrays.sort(flat);

        // Return the middle element
        return flat[(n * m) / 2];
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        System.out.println("Median: " + findMedian(matrix));
    }
}
