//hoares partitioning
//Time complexity: O(n)
//Space complexity: O(1)
//compare with lomuto partitioning, it is more efficient as it does less swaps and comparisons
//but it is not stable as it does not maintain the relative order of equal elements
//and the pivot element is not necessarily in its final position after partitioning
//below code is when ist element is pivot, if we want to use last element as pivot, we can swap it with first element before partitioning
//leetcode: https://leetcode.com/problems/sort-an-array/description/
public class HoaresPartition {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};
        int pivot = 3;
        hoaresPartition(arr, pivot);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void hoaresPartition(int[] arr, int pivot) {
        int left = 0;
        int right = arr.length - 1;

        while (true) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left >= right) {//when left and right pointers cross, we have partitioned the array
                return;
            }
            swap(arr, left, right);//swap the elements at left and right pointers
            left++;
            right--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
//the more standard version of hoare partition is below
//the difference is that it returns the index of the pivot element after partitioning

public int partition(int[] nums) {
    int pivot = nums[0];

    int i = -1;
    int j = nums.length;

    while (true) {
        do {
            i++;
        } while (nums[i] < pivot);

        do {
            j--;
        } while (nums[j] > pivot);

        if (i >= j) {
            return j;//return the index of the pivot element after partitioning
        }

        swap(nums, i, j);
    }
}
