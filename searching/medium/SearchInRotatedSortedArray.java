
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {40, 50, 60, 70, 10, 30, 20};
        int x = 30;
        int z = sorted(arr, x);
        if (z >= 0) {

            System.out.println("found at index: " + z);
        } else {
            System.out.println("not found");
        }
    }

    static int sorted(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            if (arr[low] < arr[mid]) {//it means left half is sorted
                if (x >= arr[low] && x < arr[mid]) {//checking if x lies in the range and if array is sorted 
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {//it means right half is sorted 
                if (x <= arr[high] && x > arr[mid]) {//checking if x lies in the range and if array is sorted 
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }

        return -1;

    }
}
