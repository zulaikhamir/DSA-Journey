//Idea behind insertion sort is to divide the array into sorted and unsorted parts. Initially, the sorted part contains only the first element of the array, and the unsorted part contains the rest of the elements. The algorithm iteratively takes each element from the unsorted part and inserts it into its correct position in the sorted part.
//TC: O(n^2) because in the worst case, we have to compare each element with all the elements in the sorted part.
//Sc: O(1) because we are sorting the array in place and not using any extra space to store the sorted elements.
//It is both a stable and in-place sorting algorithm. It is stable because it does not change the relative order of equal elements, and it is in-place because it does not require any additional space for sorting.
public class InsertionSort{
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {// we are not using arr[j] >= key because we want to maintain the stability of the sorting algorithm and if we use arr[j] >= key then we will be overwriting the element at j+1 which is equal to key and we will lose the relative order of equal elements
                //can i do arr[j]==key? no because we want to maintain the stability of the sorting algorithm and if we use arr[j]==key then we will be overwriting the element at j+1 which is equal to key and we will lose the relative order of equal elements
                arr[j + 1] = arr[j];//shift the element to the right //are we overwriting the element at j+1? no because we are shifting the element to the right and we will insert the key at the correct position after the while loop
                j = j - 1;
            }
            arr[j + 1] = key;// we are overriding  the number with itself in case its already sorted

        }
    }
}
