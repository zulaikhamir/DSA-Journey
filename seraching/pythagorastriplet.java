
import java.util.Arrays;

public class pythagorastriplet {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 5};

        if (hasPythagoreanTriplet(arr)) {
            System.out.println("Yes, Pythagoras triplet exists.");
        } else {
            System.out.println("No triplet exists.");
        }
    }

    static boolean hasPythagoreanTriplet(int[] arr) {
        int n = arr.length;

        // Square all elements
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // Sort the squared array
        Arrays.sort(arr);

        // Fix one element (as c^2) and check for other two using two pointers
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] == arr[i]) {
                    //System.out.println("Found triplet: " + (int) Math.sqrt(arr[left]) + ", " + (int) Math.sqrt(arr[right]) + ", " + (int) Math.sqrt(arr[i]));
                    return true;
                }

                if (arr[left] + arr[right] < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }
}
