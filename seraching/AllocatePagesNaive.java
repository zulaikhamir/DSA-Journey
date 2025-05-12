
public class AllocatePagesNaive {

    // Utility function to get sum of pages from start to end index
    static int sum(int[] arr, int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += arr[i];
        }
        return total;
    }

    // Naive recursive function to allocate pages
    static int minPages(int[] arr, int n, int m) {
        // Base cases
        if (m == 1) {
            return sum(arr, 0, n - 1); // one student takes all books
        }
        if (n == 1) {
            return arr[0]; // one book, return its pages
        }

        int result = Integer.MAX_VALUE;

        // Consider different places to partition
        for (int i = 1; i <= n - 1; i++) {
            int left = minPages(arr, i, m - 1);     // allocate first i books to m-1 students
            int right = sum(arr, i, n - 1);         // allocate remaining books to last student
            int currentMax = Math.max(left, right); // max of this partition
            result = Math.min(result, currentMax);  // take minimum among all partitions
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
