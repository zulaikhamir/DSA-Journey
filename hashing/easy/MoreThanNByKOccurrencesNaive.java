
public class MoreThanNByKOccurrencesNaive {

    static void printElements(int[] arr, int n, int k) {
        int x = n / k;

        for (int i = 0; i < n; i++) {
            // Count occurrences of arr[i]
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if count is more than n/k and not printed before
            boolean alreadyPrinted = false;
            for (int m = 0; m < i; m++) {
                if (arr[m] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (count > x && !alreadyPrinted) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int n = arr.length;
        int k = 4;

        printElements(arr, n, k);
    }
}
