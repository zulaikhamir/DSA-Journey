
public class SearchInInfiniteSortedArray {
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

    // Naive search method
    static int search(int[] arr, int z) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == z) {
                return i;
            }
        }
        return -1; // If element not found
    }

}
