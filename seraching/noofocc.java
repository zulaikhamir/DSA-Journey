
public class noofocc {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 5};
        int x = 2;
        int n = arr.length;

        int count = countOccurrences(arr, x, n);
        if (count == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("The number of occurrences of " + x + " is: " + count);
        }
    }

    // Function to count occurrences of x in a sorted array
    static int countOccurrences(int[] arr, int x, int n) {
        int first = firstocc(arr, 0, n - 1, x);
        if (first == -1) {
            return 0; // Element not found
        } else {
            int last = lastocc(arr, 0, n - 1, x);
            return last - first + 1;
            //This line calculates the total number of occurrences of the element by subtracting the index of 
            //the first occurrence from the index of the last occurrence and adding 1, since both indices are inclusive.

        }
    }

    // Binary Search to find the first occurrence
    static int firstocc(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x > arr[mid]) {
                low = mid + 1;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid; // found first occurrence
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // not found
    }

    // Binary Search to find the last occurrence
    static int lastocc(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x > arr[mid]) {
                low = mid + 1;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                if (mid == high || arr[mid + 1] != arr[mid]) {
                    return mid; // found last occurrence
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1; // not found
    }
}
