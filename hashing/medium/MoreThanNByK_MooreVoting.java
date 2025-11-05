
import java.util.HashMap;
import java.util.Map;

public class MoreThanNByK_MooreVoting {

    static void printElements(int[] arr, int n, int k) {
        if (k < 2) {
            return; // Edge case
        }
        // Step 1: Find potential candidates (at most k-1)
        HashMap<Integer, Integer> candidateMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];

            if (candidateMap.containsKey(num)) {
                candidateMap.put(num, candidateMap.get(num) + 1);
            } else if (candidateMap.size() < k - 1) {
                candidateMap.put(num, 1);
            } else {
                // Decrement count for all candidates
                for (Map.Entry<Integer, Integer> entry : candidateMap.entrySet()) {
                    candidateMap.put(entry.getKey(), entry.getValue() - 1);
                }
                // Remove candidates with zero count
                candidateMap.entrySet().removeIf(e -> e.getValue() == 0);
            }
        }

        // Step 2: Verify actual occurrences of potential candidates
        HashMap<Integer, Integer> actualCountMap = new HashMap<>();
        for (int num : arr) {
            if (candidateMap.containsKey(num)) {
                actualCountMap.put(num, actualCountMap.getOrDefault(num, 0) + 1);
            }
        }

        // Step 3: Print elements with count > n/k
        for (Map.Entry<Integer, Integer> entry : actualCountMap.entrySet()) {
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
