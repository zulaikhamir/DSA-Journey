
public class PeakElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 4, 10, 15};
        int n = arr.length;
        int z = getpeak(arr, n);
        if (z >= 0) {
            System.out.println("peak element is: " + z);
        } else {
            System.out.println("mo peak ele");
        }
    }

    static int getpeak(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                //if mid ist ele or mid is last ele or mid itself is the peak element 
                return mid;
            }
            if (mid > 0 && arr[mid - 1] >= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }

}

//The linear search approach (like your code) will return the first peak it encounters.
// static int getpeak(int[] arr, int n) {
// 	if (n == 1) {
// 		return arr[0]; // if array has only one element
// 	}
// 	if (arr[0] >= arr[1]) {
// 		return arr[0]; // peak is 0th element if its rhs is less
// 	}
// 	if (arr[n - 1] >= arr[n - 2]) {
// 		return arr[n - 1]; // peak is last element
// 	}
// 	for (int i = 1; i < n - 1; i++) {
// 		if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
// 			return arr[i]; // ele who has smaller to it nos on both sides
// 		}
// 	}
// 	return -1;
// }
