
import java.util.HashSet;

public class SubarrayZeroSumEfficient {

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        // Set to store prefix sums
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        boolean found = false;

        for (int num : arr) {
            sum += num;

            // If current sum is 0 or already exists in set
            if (sum == 0 || set.contains(sum)) {
                found = true;
                break;
            }

            // Add current prefix sum to set
            set.add(sum);
        }

        if (found) {
            System.out.println("Subarray with zero sum exists.");
        } else {
            System.out.println("No subarray with zero sum exists.");
        }
    }
}
