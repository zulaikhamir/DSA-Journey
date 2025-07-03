
import java.util.HashMap;
import java.util.Map;

public class MoreThanNByKOccurrencesEfficient {

    static void printElements(int[] arr, int n, int k) {
        // Create an empty HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Print elements with count more than n/k
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / k) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int n = arr.length;
        int k = 4;

        printElements(arr, n, k);
    }
}
