//Allocate min no of pages
public class AllocatePagesEff {

    // Function to check if it's possible to allocate pages within the given max limit
    static boolean isPossible(int[] arr, int n, int m, int maxPages) {
        int studentsRequired = 1;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxPages) {
                return false; // A single book has more pages than max limit
            }
            if (currentSum + arr[i] > maxPages) {
                studentsRequired++; // Need another student
                currentSum = arr[i]; // Start counting pages for the new student
            } else {
                currentSum += arr[i]; // Add pages to current student's total
            }
        }

        return studentsRequired <= m; // Check if we can allocate within m students
    }

    // Function to find the minimum number of pages to allocate
    static int minPages(int[] arr, int n, int m) {
        int totalPages = 0;
        for (int page : arr) {
            totalPages += page;
        }

        int low = 0, high = totalPages;
        int result = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, n, m, mid)) {
                result = mid; // Update result and try for a smaller max limit
                high = mid - 1;
            } else {
                low = mid + 1; // Try for a larger max limit
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
        int m = 2;

        System.out.println("Minimum pages = " + minPages(arr, n, m));
    }
}
