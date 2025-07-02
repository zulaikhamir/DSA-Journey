
public class SubarrayGivenSumNaive {

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        boolean found = false;

        // Outer loop for starting index
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            // Inner loop for ending index
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                // Check if current sum equals target sum
                if (sum == targetSum) {
                    System.out.println("Subarray found from index " + i + " to " + j);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray with given sum found.");
        }
    }
}
