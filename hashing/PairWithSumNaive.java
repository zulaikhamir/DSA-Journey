
public class PairWithSumNaive {

    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 6, 2, 9};
        int targetSum = 10;

        boolean pairFound = false;

        // Check all possible pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // If pair with given sum is found
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    pairFound = true;
                    break;
                }
            }
            if (pairFound) {
                break; // Exit outer loop once pair is found
            }
        }

        if (!pairFound) {
            System.out.println("No pair found.");
        }
    }
}
