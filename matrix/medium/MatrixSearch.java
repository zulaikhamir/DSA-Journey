// This program searches for a target value in a 2D matrix. The matrix is sorted in ascending order both row-wise and column-wise.
//  The search starts from the top-right corner of the matrix and moves left or down based on the comparison
//  with the target value. If the target is found, it returns true; otherwise, it returns false after checking 
//  all possible positions.
// For example, if the matrix is:
// 1 4 7 11
// 2 5 8 12
// 3 6 9 16
// 10 13 14 17
// And the target is 5, the output will be "Element found." If the target is 15, the output will be "Element not found."
//the search will go from 1->4->7->11->12->8->5 and find the element 5
public class MatrixSearch {

    public static boolean search(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0) {
            return false;
        }
        int m = matrix[0].length;

        int row = 0, col = m - 1; // start at top-right

        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down

            }
        }

        return false;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };

        int target = 5;

        if (search(matrix, target)) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
    }
}
