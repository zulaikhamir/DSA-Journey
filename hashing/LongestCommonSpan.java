
public class LongestCommonSpan {

    // Function to find longest common span with same sum
    static int longestCommonSum(int[] arr1, int[] arr2, int n) {
        int maxLen = 0;

        // Try every pair (i, j)
        for (int i = 0; i < n; i++) {
            int sum1 = 0, sum2 = 0;

            for (int j = i; j < n; j++) {
                // Add current elements to both sums
                sum1 += arr1[j];
                sum2 += arr2[j];

                // If sums are same, update maxLen
                if (sum1 == sum2) {
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                }
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
