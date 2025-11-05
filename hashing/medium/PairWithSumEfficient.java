
import java.util.HashSet;

public class PairWithSumEfficient {

    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 6, 2, 9};
        int targetSum = 10;

        // Create a HashSet to store visited elements
        HashSet<Integer> seen = new HashSet<>();

        boolean pairFound = false;

        // Traverse the array
        for (int num : arr) {
            int complement = targetSum - num;

            // Check if complement exists in the set
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                pairFound = true;
                break;
            }

            // Add the current number to the set
            seen.add(num);
        }

        if (!pairFound) {
            System.out.println("No pair found.");
        }
    }
}
