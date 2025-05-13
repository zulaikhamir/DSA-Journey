
public class MatrixMedianEfficient {

    // Count elements <= target in a sorted row
    private static int countLessEqual(int[] row, int target) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (row[mid] <= target) {
                low = mid + 1; 
            }else {
                high = mid;
            }
        }
        return low;
    }

    public static int findMedian(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m - 1]);
        }

        int desired = (n * m) / 2;

        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;

            for (int i = 0; i < n; i++) {
                count += countLessEqual(matrix[i], mid);
            }

            if (count <= desired) {
                low = mid + 1; 
            }else {
                high = mid;
            }
        }

        return low;
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
