
import java.util.HashMap;

public class LongestSubarraySumEfficient {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int targetSum = 15;

        // HashMap to store prefixSum and its first occurrence index
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // If prefixSum equals targetSum, subarray from 0 to i
            if (prefixSum == targetSum) {
                maxLength = i + 1;
            }

            // If (prefixSum - targetSum) exists in map, update maxLength
            if (prefixSumMap.containsKey(prefixSum - targetSum)) {
                int length = i - prefixSumMap.get(prefixSum - targetSum);
                if (length > maxLength) {
                    maxLength = length;
                }
            }

            // If this prefixSum is seen for the first time, put it in map
            if (!prefixSumMap.containsKey(prefixSum)) {
                prefixSumMap.put(prefixSum, i);
            }
        }

        if (maxLength == 0) {
            System.out.println("No subarray with given sum found.");
        } else {
            System.out.println("Length of longest subarray with sum " + targetSum + " is: " + maxLength);
        }
    }
}
