//lomuto partition when the pivot is the last element of the array
//why is it called lomuto partition? because it was proposed by Nico Lomuto in his paper "Partitioning Schemes for Quicksort" in 1994. The Lomuto partition scheme is a simple and efficient way to partition an array around a pivot element, which is typically the last element of the array. The algorithm works by maintaining two pointers, one for the current element being examined and another for the position of the last smaller element. As it iterates through the array, it swaps elements to ensure that all elements less than or equal to the pivot are on one side, and all elements greater than the pivot are on the other side.
//time complexity: O(n) where n is the number of elements in the array
//leetcode: https://leetcode.com/problems/sort-an-array/description/
public class LomutoPartition{
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        int pivot = arr[arr.length - 1];
        int partitionIndex = lomutoPartition(arr, pivot);
        System.out.println("Partitioned array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nPivot index: " + partitionIndex);
    }

    public static int lomutoPartition(int[] arr, int pivot) {
        int i = -1; // Index of smaller element
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, arr.length - 1); // Place pivot in the correct position
        return i + 1; // Return the index of the pivot
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//if the pivo is not the last element of the array, we can simply swap the pivot with the last element before calling the lomutoPartition function. This way, we can still use the same partitioning logic without any modifications. For example, if we want to use the first element as the pivot, we can do the following:
/*
public static void main(String[] args) {
    int[] arr = {10, 80, 30, 90, 40, 50, 70};
    int pivotIndex = 0; // Using the first element as the pivot
    swap(arr, pivotIndex, arr.length - 1); // Move pivot to the end
    int partitionIndex = lomutoPartition(arr, arr[arr.length - 1]);
    System.out.println("Partitioned array: ");
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println("\nPivot index: " + partitionIndex);
}
*/
//if i want to sort an arrat using lumoto partition, i can use the quicksort algorithm which is a divide and conquer algorithm that uses the partitioning logic to sort the array. The quicksort algorithm works by selecting a pivot element, partitioning the array around the pivot, and then recursively sorting the subarrays on either side of the pivot. Here is an example of how to implement quicksort using the Lomuto partition scheme:but using only basic idea of lumoto which is in this code can not be used to sort the array entirely,we need quicsort for that
