
public class SpiralOrderTraversal {

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        int index = 0;

        while (top <= bottom && left <= right) {
            // Traverse left to right
            for (int i = left; i <= right; i++) {
                result[index++] = matrix[top][i];
            }
            top++;

            // Traverse top to bottom
            for (int i = top; i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            right--;

            // Traverse right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = matrix[bottom][i];
                }
                bottom--;
            }

            // Traverse bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = matrix[i][left];
                }
                left++;
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int[] spiral = spiralOrder(matrix);

        System.out.println("Spiral Traversal:");
        for (int val : spiral) {
            System.out.print(val + " ");
        }
    }
}
