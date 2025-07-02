
public class SubarrayGivenSumEfficient {

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        int currSum = arr[0];
        int start = 0;
        boolean found = false;

        // Traverse the array from index 1 to end
        for (int end = 1; end <= arr.length; end++) {

            // Shrink the window as long as current sum is greater than targetSum
            while (currSum > targetSum && start < end - 1) {
                currSum -= arr[start];
                start++;
            }

            // Check if current sum equals targetSum
            if (currSum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + (end - 1));
                found = true;
                break;
            }

            // Add next element to currSum if end is within array bounds
            if (end < arr.length) {
                currSum += arr[end];
            }
        }

        if (!found) {
            System.out.println("No subarray with given sum found.");
        }
    }
}
