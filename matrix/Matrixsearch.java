
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
