//what is merge sort? Merge sort is a divide-and-conquer algorithm that breaks down a list into smaller sublists until each sublist contains a single element. Then, it merges those sublists back together in a sorted order. The process involves recursively splitting the list and then merging the sorted sublists to produce the final sorted list. Merge sort has a time complexity of O(n log n) and is efficient for sorting large datasets.
//ist i will write merge sort function
//what is the below function actualy doing its simply merging two sorted arrays into a single sorted array. It takes two integer arrays as input, combines them into a new array, sorts the combined array, and then prints the sorted elements. The function first creates a new array 'c' that can hold all elements from both input arrays 'a' and 'b'. It then copies the elements of 'a' and 'b' into 'c', sorts 'c' using the built-in Arrays.sort() method, and finally prints the sorted elements of 'c'.
//this is naive approach to merge two sorted arrays, as it does not take advantage of the fact that the input arrays are already sorted. A more efficient way to merge two sorted arrays would be to use a two-pointer technique, which would have a time complexity of O(m + n) instead of O((m + n) log (m + n)) due to sorting the combined array.
// void merge(int[] a,int[] b){
//     int m=a.length;
//     int n=b.length;
//     int[] c=new int[m+n];
//     for(int i=0;i<m;i++){
//         c[i]=a[i];
//     }
//     for(int i=0;i<n;i++){
//         c[m+i]=b[i];
//     }
//     Arrays.sort(c);
//     for(int i=0;i<m+n;i++){
//         System.out.print(c[i]+" ");
//     }
// }
//efficient way to merge two sorted arrays using two-pointer technique
//tc: O(m + n) where m and n are the lengths of the two input arrays
// void merge(int[] a, int[] b) {
//     int m = a.length;
//     int n = b.length;
//     int[] c = new int[m + n];
//     int i = 0, j = 0, k = 0;
//     while (i < m && j < n) {
//         if (a[i] < b[j]) {
//             c[k] = a[i];
//             i++;
//         } else {
//             c[k] = b[j];
//             j++;
//         }
//         k++;
//     }
//     while (i < m) {
//         c[k] = a[i];
//         i++;
//         k++;
//     }
//     while (j < n) {
//         c[k] = b[j];
//         j++;
//         k++;
//     }
// }


//Merge function of merge sort
//TC: O(n) where n is the total number of elements in the two subarrays being merged
//SC: O(n) due to the temporary arrays used for merging



//complete merge sort implementation
public class MergeSort {

    void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;//calculate the size of the two subarrays to be merged
        int n2 = high - mid;//calculate the size of the second subarray

        int[] L = new int[n1];//   create temporary arrays to hold the elements of the two subarrays
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)//copy the elements of the first subarray into the temporary array L
            L[i] = arr[low + i];
        for (int j = 0; j < n2; j++)//copy the elements of the second subarray into the temporary array R
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {//merge the two subarrays back into arr in sorted order
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {//copy any remaining elements of L, if there are any
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {//copy any remaining elements of R, if there are any
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSort(int[] arr, int low, int high) {
        if (low < high) {//base case: if the array has one or zero elements, it is already sorted
            int mid = low + (high - low) / 2;//find the middle point to divide the array into two halves
            mergeSort(arr, low, mid);//recursively sort the first half
            mergeSort(arr, mid + 1, high);//recursively sort the second half
            merge(arr, low, mid, high);//merge the sorted halves
        }
    }
}
