
public class LongestSubarraySumNaive {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int targetSum = 15;

        int maxLength = 0;

        // Outer loop for starting index
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;

            // Inner loop for ending index
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];

                // If current sum equals target, update maxLength
                if (currSum == targetSum) {
                    int length = j - i + 1;
                    if (length > maxLength) {
                        maxLength = length;
                    }
                }
            }
        }

        if (maxLength == 0) {
            System.out.println("No subarray with given sum found.");
        } else {
            System.out.println("Length of longest subarray with sum " + targetSum + " is: " + maxLength);
        }
    }
}
