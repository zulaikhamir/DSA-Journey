
import java.util.HashMap;

public class DistinctElementsInWindowEfficien {

    static void countDistinct(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count distinct elements in first window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print(map.size() + " ");

        // Process rest of the windows
        for (int i = k; i < n; i++) {
            // Remove first element of previous window
            int elementToRemove = arr[i - k];
            map.put(elementToRemove, map.get(elementToRemove) - 1);
            if (map.get(elementToRemove) == 0) {
                map.remove(elementToRemove);
            }

            // Add new element of current window
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // Print count of distinct elements for current window
            System.out.print(map.size() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int n = arr.length;
        int k = 4;

        countDistinct(arr, n, k);
    }
}
