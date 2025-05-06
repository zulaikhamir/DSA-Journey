
// public class indexofistocc {//naive soln
//     public static void main(String[] args) {
//         int[] arr = {1, 4, 2, 5, 6, 7, 4, 3, 9, 0};
//         int n = arr.length;
//         int x = 4;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == x) {
//                 System.out.println("found at index " + i + " and is " + arr[i]);
//                 return;
//             }
//         }
//         System.out.println("not found");
//     }
// }
// public class indexofistocc {//recursive
//     public static void main(String[] args) {
//         int[] arr = {1, 4, 2, 5, 6, 7, 4, 5, 3, 9, 0};
//         int n = arr.length;
//         int x = 5;
//         int low = 0;
//         int high = n - 1;
//         int z = firstocc(arr, low, high, x);
//         if (z > 0) {
//             System.out.println(z);
//         } else {
//             System.out.println("not present");
//         }
//     }
//     // Function to find the first occurrence of 'x' in sorted array 'arr'
//     static int firstocc(int[] arr, int low, int high, int x) {
//         // Base case: if search space becomes invalid, element not found
//         if (low > high) {
//             return -1;
//         }
//         // Find the middle index of current search space
//         int mid = (low + high) / 2;
//         // If x is greater than middle element, search in right half
//         if (x > arr[mid]) {
//             return firstocc(arr, mid + 1, high, x);
//             // If x is smaller than middle element, search in left half
//         } else if (x < arr[mid]) {
//             return firstocc(arr, low, mid - 1, x);
//             // If x is found at mid
//         } else {
//             // Check if it's the first occurrence:
//             // - either it's the first element of array (mid == 0)
//             // - or previous element is not equal to current element
//             if ((mid == 0) || arr[mid - 1] != arr[mid]) {
//                 return mid;  // This is the first occurrence
//             } else {
//                 // Otherwise, there might be earlier occurrence — search in left half
//                 return firstocc(arr, low, mid - 1, x);
//             }
//         }
//     }
// }
public class indexofistocc {//iterative

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 6, 7, 4, 5, 3, 9, 0};
        int n = arr.length;
        int x = 5;
        int low = 0;
        int high = n - 1;
        int z = firstocc(arr, low, high, x);
        if (z > 0) {
            System.out.println(z);
        } else {
            System.out.println("not present");
        }

    }

    static int firstocc(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x > arr[mid]) {
                low = mid + 1;
            } else {
                if (x < arr[mid]) {
                    high = mid - 1;
                } else if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                      
                ///here we are returning our answer
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

}
