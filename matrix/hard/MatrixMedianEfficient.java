//the difference between this program and the previous matrix median program is that this program is more 
// efficient because it uses binary search to find the median instead of sorting the entire matrix. 
// The time complexity of this program is O(n * log(max - min)), where n is the number of rows in the matrix, 
// and max and min are the maximum and minimum elements in the matrix, respectively. 
// This is because we perform a binary search on the range of possible median values (from min to max)
//  and for each mid value, we count how many elements are less than or equal to mid in each row using binary search.
//  The space complexity is O(1) because we only use a constant amount of extra space.
//the dry run of the program is as follows:
// 1. We first find the minimum and maximum elements in the matrix. In this case, min = 1 and max = 9.
// 2. We then perform a binary search on the range of possible median values (from min to max). The first mid value is (1 + 9) / 2 = 5.
// 3. We count how many elements are less than or equal to 5 in each row using binary search. The counts are 3, 2, and 2, respectively, for a total count of 7.
// 4. Since the total count (7) is greater than the desired count (4), we set high = mid = 5 and repeat the binary search. The next mid value is (1 + 5) / 2 = 3.
// 5. We count how many elements are less than or equal to 3 in each row using binary search. The counts are 2, 1, and 1, respectively, for a total count of 4.
// 6. Since the total count (4) is equal to the desired count (4), we set high = mid = 3 and repeat the binary search. The next mid value is (1 + 3) / 2 = 2.
// 7. We count how many elements are less than or equal to 2 in each row using binary search. The counts are 1, 1, and 0, respectively, for a total count of 2.
// 8. Since the total count (2) is less than the desired count (4   ), we set low = mid + 1 = 3 and repeat the binary search. The next mid value is (3 + 3) / 2 = 3.
// 9. We count how many elements are less than or equal to 3 in each row using binary search. The counts are 2, 1, and 1, respectively, for a total count of 4.
// 10. Since the total count (4) is equal to the desired count (4), we set high = mid = 3 and repeat the binary search. The next mid value is (3 + 3) / 2 = 3.
// 11. Since low = high = 3, we exit the binary search and return low = 3 as the median of the matrix.  
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
