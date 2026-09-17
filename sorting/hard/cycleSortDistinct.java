//Cycle sort is worst case o(n^2) but it is optimal in terms of number of writes to the original array. It is based on the idea that array to be sorted can be divided into cycles. The number of writes is minimized by rotating the elements within a cycle to their correct positions.
//cycle sort is optimal in terms of memory writes. It is an in-place, unstable sorting algorithm. It is based on the idea that array to be sorted can be divided into cycles. The number of writes is minimized by rotating the elements within a cycle to their correct positions.
//useful to solve questions like find the minimum number of swaps required to sort an array. It is also used in situations where memory writes are costly, such as in flash memory or EEPROMs.

//below implementation is cycle sort for distinct elements. It can be modified to work for arrays with duplicate elements as well.
public class cycleSortDistinct {
    public static void cycleSort(int[] arr) {
        int n = arr.length;
        for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            if (pos == cycleStart) {
                continue;
            }

            while (item == arr[pos]) {
                pos++;
            }

            if (pos != cycleStart) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            while (pos != cycleStart) {
                pos = cycleStart;

                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }

}
//implementation of cycle sort with duplicate elements is below
class cycleSortDuplicate {
    public static void cycleSort(int[] arr) {
        int n = arr.length;
        for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            if (pos == cycleStart) {
                continue;
            }

            while (item == arr[pos]) {
                pos++;
            }

            if (pos != cycleStart) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            while (pos != cycleStart) {
                pos = cycleStart;

                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }
}

//Implementation of cycle sort to count the number of swaps required to sort an array
class cycleSortCountSwaps {
    public static int cycleSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            if (pos == cycleStart) {
                continue;
            }

            while (item == arr[pos]) {
                pos++;
            }

            if (pos != cycleStart) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                swapCount++;
            }

            while (pos != cycleStart) {
                pos = cycleStart;

                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}
