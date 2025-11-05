public class MaxInSubarraysNaive {
    public static void maxInSubarrays(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 8, 6};
        int k = 3;
        maxInSubarrays(arr, k);
    }
}
