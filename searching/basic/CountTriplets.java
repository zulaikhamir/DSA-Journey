
import java.util.Arrays;

public class CountTriplets {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4, 7, 6};
        int target = 12;

        int count = countTriplets(arr, target);
        System.out.println("Number of triplets: " + count);
    }

    static int countTriplets(int[] arr, int target) {
        Arrays.sort(arr); // Sorting array
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    count++;
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
