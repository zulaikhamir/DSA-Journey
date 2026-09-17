//naive solution
//Time complexity: O(nlogn)
//Space complexity: O(1)
//This modifies the original array, if that is not allowed we can create a copy of the array and sort it.
class Solution {
    public int kthSmallest(int[] arr, int k) {

        Arrays.sort(arr);
        return arr[k-1];

    }
}
//optimal solution
//using lumoto quik sort algorithm
//the worst case time complexity is O(n^2) when the array is already sorted or reverse sorted, but on average it is O(n)
//space complexity: O(1) if we do it in place, otherwise O(n)
// we call this as optimal even though the worst case is O(n^2) because it is very unlikely to happen and we can use random pivot selection to mitigate this issue.
//this algoritm is called quick select and it is a selection algorithm to find the k-th smallest element in an unordered list. It is related to the quick sort sorting algorithm. Like quick sort, it was developed by Tony Hoare, and thus is also known as Hoare's selection algorithm.
class Solution{
    public int kthSmallest(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    private int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) {//if onlt one element is left
            return arr[left];
        }

        int pivotIndex = Lumotopartition(arr, left, right);

        if (k == pivotIndex) {//if the pivot is the k-th smallest element
            return arr[k];
        } else if (k < pivotIndex) {//if the k-th smallest element is in the left partition
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    private int Lumotopartition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
