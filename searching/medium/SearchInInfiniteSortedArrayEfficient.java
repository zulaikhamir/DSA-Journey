
public class SearchInInfiniteSortedArrayEfficient {

    public static void main(String[] args) {
        int[] arr = {1, 10, 15, 20, 40, 60, 90, 100, 120, 500};
        int z = 90;

        int x = search(arr, z);
        if (x >= 0) {
            System.out.println("Found at index: " + x);
        } else {
            System.out.println("Not found");
        }
    }

    // Exponential search method
    static int search(int[] arr, int z) {
        if (arr[0] == z) { // If the first element is the target we check it explicitly
            return 0;
        }

        int i = 1;

        // Exponentially increase 'i' until we exceed or match the target
        while (i < arr.length && arr[i] < z) {
            i = i * 2;
        }

        // Check if we found the target at 'i'
        if (i < arr.length && arr[i] == z) {
            return i;
        }

        // Set right boundary safely within array bounds
        int right = Math.min(i, arr.length - 1);

        // Perform binary search in the range (i/2) to min(i, n-1)
        return binarySearch(arr, z, i / 2, right);
    }

    // Standard binary search method
    static int binarySearch(int[] arr, int z, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == z) {
                return mid;
            } else if (arr[mid] < z) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If element not found
        return -1;
    }
}
