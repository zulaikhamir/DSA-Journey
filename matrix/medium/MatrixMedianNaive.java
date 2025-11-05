
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
