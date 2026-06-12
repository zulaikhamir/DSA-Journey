//quicksort using hoare partition scheme
//the difference between hoare and lomuto partition scheme is that in hoare partition scheme, the pivot is not necessarily the last element of the array, and it uses two pointers to partition the array, while in lomuto partition scheme, the pivot is always the last element of the array, and it uses a single pointer to partition the array.
public class QuickSortHoare {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi);//this is the difference between hoare and lomuto partition scheme, in hoare partition scheme, we call quickSort on the left side of the pivot, while in lomuto partition scheme, we call quickSort on the right side of the pivot.
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
