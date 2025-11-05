
import java.util.HashMap;

public class LongestCommonSpanEfficient {

    static int longestCommonSum(int[] arr1, int[] arr2, int n) {
        // HashMap to store first occurrence of prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxLen = 0;
        int preSum = 0;

        for (int i = 0; i < n; i++) {
            // Calculate difference and update prefix sum
            int diff = arr1[i] - arr2[i];
            preSum += diff;

            // If prefix sum is 0, update maxLen
            if (preSum == 0) {
                maxLen = i + 1;
            }

            // If prefix sum is already present
            if (map.containsKey(preSum)) {
                int prevIndex = map.get(preSum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                // Store first occurrence of this prefix sum
                map.put(preSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 0, 0, 1, 0};
        int n = arr1.length;

        System.out.println("Length of the longest common span with same sum is: "
                + longestCommonSum(arr1, arr2, n));
    }
}
