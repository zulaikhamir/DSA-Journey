//return index of second largest

public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 45, 6, 7};
        int n = arr.length;
        int x = secondlargest(arr, n);
        System.out.println("second largest is: " + x);
    }

    static int secondlargest(int[] arr, int n) {
        int largeestt = largest(arr, n);
        int res = -1;//incasse no 2nd largest
        for (int i = 0; i < n; i++) {
            if ((arr[i]) != largeestt) {
                if (res == -1) {
                    res = arr[i];
                } else {
                    if (arr[i] > res) {
                        res = arr[i];
                    }
                }
            }

        }
        return res;

    }

    static int largest(int[] arr, int n) {

        //int max = 0;//consider max at index zero
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {//arr[max]
                max = arr[i];
            }
        }
        return max;

    }
}
