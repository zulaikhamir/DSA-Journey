
//leetcode 493. Reverse Pairs
//Naive solution O(n^2) time complexity
class CountInversions {
    public int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > 2L*nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
//what is 2L? It is a long literal. We need to use long to avoid integer overflow when multiplying nums[j] by 2. If nums[j] is a large positive integer, multiplying it by 2 could exceed the maximum value of an int, resulting in incorrect comparisons. By using 2L, we ensure that the multiplication is done in the long data type, which can handle larger values without overflow.
//now the efficint solution using merge sort O(n log n) time complexity
class CountInversions {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) {// Base case: single element or empty array
            return 0;
        }
        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);
        count += merge(nums, left, mid, right);
        return count;
    }

    private int merge(int[] nums, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;// Start of the right half

        // Count the reverse pairs
        for (int i = left; i <= mid; i++) {// Iterate through the left half
            while (j <= right && nums[i] > 2L * nums[j]) {// Move j until the condition is no longer satisfied
                j++;
            }
            count += j - (mid + 1);// All elements from mid+1 to j-1 are reverse pairs with nums[i]
        }

        // Merge the two halves
        int[] temp = new int[right - left + 1];
        int i = left, k = 0;
        j = mid + 1;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        System.arraycopy(temp, 0, nums, left, temp.length);
        return count;
    }
}
