
import java.util.HashSet;

public class DistinctElementsInWindowNaive {

    static void countDistinct(int[] arr, int n, int k) {
        for (int i = 0; i <= n - k; i++) {
            HashSet<Integer> set = new HashSet<>();

            // Count distinct elements in current window
            for (int j = i; j < i + k; j++) {
                set.add(arr[j]);
            }

            // Print count of distinct elements for this window
            System.out.print(set.size() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int n = arr.length;
        int k = 4;

        countDistinct(arr, n, k);
    }
}
