
public class ones {

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        // Binary search to find first occurrence of 1
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == 0) {
                // If middle element is 0, search in right half
                low = mid + 1;
            } else {
                // If it's the first 1 or previous element is 0, we found our first 1
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    // Number of 1s = total elements - index of first 1
                    System.out.println("Number of 1s: " + (n - mid));
                    return;
                } else {
                    // Else, continue searching in left half
                    high = mid - 1;
                }
            }
        }

        System.out.println("No 1s present");
    }
}
