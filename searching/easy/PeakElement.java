//this is using binary search approach to find peak element in an array
public class PeakElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 4, 10, 15};//the answer is 7 as it is greater than its neighbors
        int n = arr.length;
        int z = getPeakIndex(arr, n);
        if (z >= 0) {
            System.out.println("peak element is: " + z);
        } else {
            System.out.println("no peak element found");
        }
    }

   static int getPeakIndex(int[] arr, int n) {
    int low = 0;
    int high = n - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        boolean leftOk = (mid == 0 || arr[mid - 1] <= arr[mid]);//check if mid is greater than or equal to its left neighbor
        boolean rightOk = (mid == n - 1 || arr[mid + 1] <= arr[mid]);//check if mid is greater than or equal to its right neighbor

        if (leftOk && rightOk) return mid;//if mid is greater than or equal to both neighbors, return mid as the index of the peak element

        if (arr[mid - 1] > arr[mid]) {//if the left neighbor is greater than mid, then there must be a peak element in the left half of the array becuase the elements are increasing towards the left
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return -1;
}

}
//peak element is an element which is greater than or equal to its neighbors. For corner elements, we need to consider only one neighbor. For example, for the first element, we need to consider only the second element. Similarly, for the last element, we need to consider only the second last element.
//The linear search approach  will return the first peak it encounters.
static int getpeak(int[] arr, int n) {
	if (n == 1) {
		return arr[0]; // if array has only one element
	}
	if (arr[0] >= arr[1]) {
		return arr[0]; // peak is 0th element if its rhs is less
	}
	if (arr[n - 1] >= arr[n - 2]) {
		return arr[n - 1]; // peak is last element
	}
	for (int i = 1; i < n - 1; i++) {
		if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
			return arr[i]; // ele who has smaller to it nos on both sides
		}
	}
	return -1;
}
