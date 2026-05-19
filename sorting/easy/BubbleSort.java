//bubble sort
public class BubbleSort {
    /**
     * Runs a simple example: sorts a hard-coded integer array and prints the sorted values.
     *
     * The method initializes an array with the values {5, 1, 4, 2, 8}, sorts it in place
     * using bubbleSort(int[]), and prints each element followed by a space.
     */
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts the given integer array in ascending order using the bubble sort algorithm.
     *
     * This method performs the sort in-place and modifies the contents of the supplied array.
     *
     * @param arr the integer array to sort; must not be null
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
