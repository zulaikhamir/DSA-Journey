//what is counting sort?
//it is an algorithm that sorts elements based on the count of each unique element
// it works by counting the number of occurrences of each unique element in the input array and then using that information to place the elements in the correct order in the output array.


//naive implementation below with count array
//time complexity: O(n+k) where n is the number of elements in the input array and k is the range of the input values
//space complexity: O(k) where k is the range of the input values
//problems with this implementation: it only works for non-negative integers and it is not stable
//it can not be used for sorting an array of objects or strings, and it is not suitable for large ranges of input values.
// class CountingSort {
//     public static void countingSort(int[] arr) {
//         int n = arr.length;

//         // Find the maximum element in the array
//         int max = arr[0];//what is this for ?
//         //this is to find the maximum value in the array so that we can create a count array of size max+1
//         for (int i = 1; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         // Create a count array to store the count of each unique element
//         int[] count = new int[max + 1];

//         // Count the occurrences of each element in the input array
//         for (int i = 0; i < n; i++) {
//             count[arr[i]]++;
//         }

//         // Build the output array
//         int index = 0;
//         for (int i = 0; i <= max; i++) {
//             while (count[i] > 0) {
//                 arr[index++] = i;
//                 count[i]--;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 2, 2, 8, 3, 3, 1};
//         countingSort(arr);
//         System.out.println("Sorted array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }


//below is general purpose implementation of counting sort that can handle negative integers and is stable
//but it still works only for integers and not for objects or strings
//time complexity: O(n+k) where n is the number of elements in the input array and k is the range of the input values
//space complexity: O(k) where k is the range of the input values
// class GeneralCountingSort {
//     public static void generalCountingSort(int[] arr) {
//         int n = arr.length;

        // Find the minimum and maximum elements in the array
        //what will happen by finding the minimum and maximum elements in the array?
        //By finding the minimum and maximum elements in the array, we can determine the range of the input values. This allows us to create a count array that can accommodate both negative and positive integers, ensuring that we can accurately count the occurrences of each unique element in the input array.
        //how is it different from above above implementation?
        //In the above implementation, we only find the maximum element to create a count array of size max+1, which works only for non-negative integers. In this general implementation, we find both the minimum and maximum elements to create a count array that can handle negative integers as well. This allows us to sort arrays containing both negative and positive integers.
//         int min = arr[0];
//         int max = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         // Create a count array to store the count of each unique element
//         int[] count = new int[max - min + 1];

//         // Count the occurrences of each element in the input array
//         for (int i = 0; i < n; i++) {
//             count[arr[i] - min]++;
//         }

//         // Build the output array
//         int index = 0;
//         for (int i = 0; i < count.length; i++) {
//             while (count[i] > 0) {
//                 arr[index++] = i + min;
//                 count[i]--;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, -2, 2, 8, -3, 3, 1};
//         generalCountingSort(arr);
//         System.out.println("Sorted array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }


//below is a more detailed implementation of counting sort with a dry run and explanation
//the concept below implements counting sort in a way that is stable and can handle non-negative integers. It uses a count array to store the frequency of each unique element and then builds the output array based on the cumulative counts. The dry run provided in the comments helps to understand how the algorithm works step by step.
//its used as subroutine in radix sort and bucket sort
//time complexity: O(n+k) where n is the number of elements in the input array and k is the range of the input values
//space complexity: O(n+k) where n is the number of elements in the input array and k is the range of the input values (due to the output array)
import java.util.Arrays;

public class CountingSort {

    public static void countSort(int[] arr, int k) {
        int n = arr.length;

        // Step 1: Create count array
        int[] count = new int[k];

        // Initialize count array with 0
        for (int i = 0; i < k; i++) {
            count[i] = 0;
        }

        // ----------------------------------------------------
        // Dry Run
        // arr = [1, 4, 4, 1, 0, 1]
        //
        // Count frequency
        //
        // count[1]++
        // count = [0,1,0,0,0]
        //
        // count[4]++
        // count = [0,1,0,0,1]
        //
        // count[4]++
        // count = [0,1,0,0,2]
        //
        // count[1]++
        // count = [0,2,0,0,2]
        //
        // count[0]++
        // count = [1,2,0,0,2]
        //
        // count[1]++
        // count = [1,3,0,0,2]
        // ----------------------------------------------------

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // ----------------------------------------------------
        // Prefix Sum
        //
        // count = [1,3,0,0,2]
        //
        // i=1
        // count[1] = count[0] + count[1]
        //          = 1 + 3 = 4
        //
        // count = [1,4,0,0,2]
        //
        // i=2
        // count[2] = 4 + 0 = 4
        //
        // count = [1,4,4,0,2]
        //
        // i=3
        // count[3] = 4 + 0 = 4
        //
        // count = [1,4,4,4,2]
        //
        // i=4
        // count[4] = 4 + 2 = 6
        //
        // count = [1,4,4,4,6]
        // ----------------------------------------------------

        for (int i = 1; i < k; i++) {
            count[i] = count[i - 1] + count[i];
        }

        int[] output = new int[n];

        // ----------------------------------------------------
        // Build output from RIGHT to LEFT
        //
        // count = [1,4,4,4,6]
        //
        // i=5, arr[5]=1
        // output[count[1]-1]
        // output[4-1]
        // output[3]=1
        //
        // output=[_,_,_,1,_,_]
        // count=[1,3,4,4,6]
        //
        // i=4, arr[4]=0
        // output[1-1]
        // output[0]=0
        //
        // output=[0,_,_,1,_,_]
        // count=[0,3,4,4,6]
        //
        // i=3, arr[3]=1
        // output[3-1]
        // output[2]=1
        //
        // output=[0,_,1,1,_,_]
        // count=[0,2,4,4,6]
        //
        // i=2, arr[2]=4
        // output[6-1]
        // output[5]=4
        //
        // output=[0,_,1,1,_,4]
        // count=[0,2,4,4,5]
        //
        // i=1, arr[1]=4
        // output[5-1]
        // output[4]=4
        //
        // output=[0,_,1,1,4,4]
        // count=[0,2,4,4,4]
        //
        // i=0, arr[0]=1
        // output[2-1]
        // output[1]=1
        //
        // output=[0,1,1,1,4,4]
        // count=[0,1,4,4,4]
        // ----------------------------------------------------

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy output back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 1, 0, 1};
        int k = 5;

        countSort(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}
