//Quicksort using Lomuto partition scheme
//time complexity: O(n log n) on average, O(n^2) in the worst case (when the smallest or largest element is always chosen as the pivot)
//space complexity: O(log n) on average, O(n) in the worst case (when the smallest or largest element is always chosen as the pivot)
//leetcode: https://leetcode.com/problems/sort-an-array/description/
public class QuickSortLomuto {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = lomutoPartition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1); // Recursively sort elements before partition
            quickSort(arr, pivotIndex + 1, high); // Recursively sort elements after partition
        }
    }

    public static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = low - 1; // Index of smaller element but why low-1? because we want to start from the first element of the array and we will increment i before swapping, so we need to initialize it to low-1 to ensure that it points to the correct position for the first swap. If we initialized i to low, it would point to the first element of the array, and when we increment it before swapping, it would skip the first element and start swapping from the second element, which is not what we want. By initializing i to low-1, we ensure that it points to the correct position for the first swap, which is the first element of the array.
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // Place pivot in the correct position
        return i + 1; // Return the index of the pivot
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
