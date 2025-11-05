
public class SubarrayZeroSumNaive {

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        boolean found = false;

        // Outer loop for starting index
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            // Inner loop for ending index
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                // Check if current subarray has zero sum
                if (sum == 0) {
                    System.out.println("Subarray with zero sum exists between indices " + i + " and " + j);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray with zero sum exists.");
        }
    }
}
