
// public class TwoPointerTechnique {//check if array has a pair with given sum
//     // we use two pointer approach for sorted arrays if we have unsosrted array we use naive solution
//     public static void main(String[] args) {
//         int[] arr = {1, 5, 2, 7, 4, 8, 5, 3};
//         int x = 11;
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] + arr[j] == x) {
//                     System.out.println("yess and the nos are :" + arr[i] + "and " + arr[j]);
//                 }
//             }
//         }
//     }
// }
public class TwoPointerTechnique {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 21;
        int n = arr.length;
        boolean y = ispair(arr, x, n);
        if (y == true) {
            System.out.println("yes");
        } else {
            System.out.println("false");
        }

    }

    static boolean ispair(int[] arr, int x, int n) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] + arr[right] == x) {
                return true;
            } else if (arr[left] + arr[right] > x) {
                right--;
            } else {
                left++;
            }
        }
        return false;

    }
}
