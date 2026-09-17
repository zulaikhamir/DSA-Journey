//three variations of this problem
//leetcode 75: sort an array of 0s, 1s and 2s
//leetcode 905: sort an array of positive and negative numbers
//leetcode 922: sort an array of even and odd numbers
// 1. sort an array of 0s and 1s
// 2. sort an array into positive and negative numbers
// 3. sort an array into even and odd numbers
//we are solving for second variation here, but the solution is the same for all three variations
//naive solution
// o(n) time and o(n) space

class SortTwoTypes {
    public static void sortTwoTypes(int[] arr) {
        int[] sorted = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sorted[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sorted[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sorted[i];
        }
    }
}

//efficient solution
// o(n) time and o(1) space
//need to learn quick sort partitioning technique for this solution
// we will solve it using hoare partitioning technique
class SortTwoTypes {
    public static void sortTwoTypes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] < 0) {
                left++;
            }
            while (left < right && arr[right] >= 0) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}


// Is this actually Hoare partition?

// Not exactly.

// In classical Hoare partition:

// You choose a pivot (for example, the first element).
// Elements < pivot go to one side and > pivot go to the other.

// Here, there is no pivot. The partitioning criterion is simply:

// even | odd

// So this is Hoare-style two-pointer partitioning, inspired by Hoare's algorithm, but adapted for a boolean condition rather than a pivot value.
