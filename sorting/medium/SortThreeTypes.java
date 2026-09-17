//naive solution
// o(n) time and o(n) space
//how many traversals it has ? 3 traversals without counting the last traversal to copy the sorted array back to original array. so total 4 traversals.
//vairaitions of this problem are:
// 1. sort an array of 0s, 1s and 2s
// 2. sort an array of positive and negative numbers
// 3. sort an array of even and odd numbers
//4. sort an array of negative, zero and positive numbers
//5. sort an array within a range of numbers. for example, sort an array of numbers between 1 to 100. we can use counting sort for this problem. we will solve it using counting sort technique
// we are solving for first variation here, but the solution is the same for all three variations
class SortThreeTypes {
    public static void sortThreeTypes(int[] arr) {
        int[] sorted = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sorted[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sorted[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
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
//Dutch National Flag Algorithm. its an variation of quick sort partitioning technique. we will solve it using hoare partitioning technique
// we are solving for first variation here, but the solution is the same for all three variations
//example input: [0,1,2,0,1,2]
class SortThreeTypes {
    public static void sortThreeTypes(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] ==0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}

//[0,1,2,0,1,2]
