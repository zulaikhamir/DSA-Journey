//naive with extra space
//TC: O(n^2)
//Sc: O(n) because we are using an extra array to store the sorted elements

// public class SelectionSort{
//     public static void selectionSort(int[] arr) {
//         int n = arr.length;
//         int[] sortedArr = new int[n];
//         for (int i = 0; i < n; i++) {
//             int minIndex = 0;
//             for (int j = 1; j < n; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             sortedArr[i] = arr[minIndex];
//             arr[minIndex] = Integer.MAX_VALUE;//to mark the element as visited
//         }
//         // Copy the sorted array back to the original array
//         for (int i = 0; i < n; i++) {
//             arr[i] = sortedArr[i];
//         }
//     }
// }




//In place optimal soluttion we are not using any extra space to store the sorted elements we are just swapping the elements in the original array
//TC: O(n^2)
//Sc: O(1)
// public class SelectionSort{
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {//why n-1 because we are comparing with the next element and if we are at the last element then there is no next element to compare with
            int minIndex=i;
            for (int j = i+1; j < n; j++) {//
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

    }
}
