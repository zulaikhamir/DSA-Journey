
public class SecondLargestEfficient {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 45, 6, 7};
        int n = arr.length;
        int x = secondlargest(arr, n);
        System.out.println("Index of second largest is: " + x);
        if (x != -1) {
            System.out.println("Second largest value is: " + arr[x]);
        } else {
            System.out.println("No second largest element found.");
        }
    }

    static int secondlargest(int[] arr, int n) {
        // If array has less than 2 elements, no second largest exists
        if (n < 2) {
            return -1;
        }

        // Initialize largest as index 0 and second largest as -1 (not found yet)
        int res = -1;
        int largest = 0;

        // Traverse the array starting from index 1
        for (int i = 1; i < n; i++) {

            // If current element is greater than the element at 'largest'
            if (arr[i] > arr[largest]) {
                // Update 'res' to current 'largest' index before changing 'largest'
                res = largest;
                largest = i;
            } // If current element is not equal to the largest
            else if (arr[i] != arr[largest]) {
                // If 'res' is not yet set OR current element is greater than current second largest
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }

        // Return index of second largest (or -1 if not found)
        return res;
    }
}
