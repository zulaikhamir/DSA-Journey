
public class RemoveDuplicatesEfficient {

    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 50, 50};

        int n = arr.length;

        remove(arr, n);
    }

    static void remove(int[] arr, int n) {

        int res = 1; // res keeps track of the position where the next unique element should be placed

        // Loop through the array starting from index 1
        for (int i = 1; i < n; i++) {
            // If current element is different from the previous unique element
            if (arr[i] != arr[res - 1]) {
                // Place the current unique element at index 'res'
                arr[res] = arr[i];
                // Increment res to move to the next position
                res++;
            }
        }

        // res is the count of unique elements in the array
        // Print unique elements only (from index 0 to res-1)
        for (int i = 0; i < res; i++) {
            System.out.println(arr[i]);
        }

    }
}
