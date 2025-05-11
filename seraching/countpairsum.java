
import java.util.Arrays;

public class countpairsum {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;

        int count = countPairs(arr, target);
        System.out.println("Number of pairs: " + count);
    }

    static int countPairs(int[] arr, int target) {
        Arrays.sort(arr); // Ensure array is sorted (skip this if already sorted)
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

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

        return count;
    }
}
