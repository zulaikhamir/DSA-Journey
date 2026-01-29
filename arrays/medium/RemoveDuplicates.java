
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 50, 50};
        // this solution works only if the array is sorted
        // if not sorted, sort the array using Arrays.sort() before calling remove()

        int n = arr.length;

        remove(arr, n);
    }

    static void remove(int[] arr, int n) {
        // Create a temporary array to store unique elements
        int[] temp = new int[n];

        // First element is always unique, so copy it to temp[0]
        temp[0] = arr[0];
        int res = 1; // 'res' keeps track of the number of unique elements found

        // Loop through the rest of the array
        for (int i = 1; i < n; i++) {
            // If current element is different from the last unique element added to temp
            if (temp[res - 1] != arr[i]) {
                // Add current element to temp and increment res
                temp[res] = arr[i];
                res++;
            }
        }

        // Copy unique elements back to the original array
        // for (int i = 0; i < n; i++) {
        //     arr[i] = temp[i];
        //     // Print the element
        //     System.out.println(arr[i]);
        // }
        //we dont need this this is bullshit
    }
}
