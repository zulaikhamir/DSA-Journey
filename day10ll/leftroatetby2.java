
public class leftroatetby2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 2;
        leftroattebytwo(arr, n, d);

    }

    static void leftroattebytwo(int[] arr, int n, int d) {
        for (int i = 0; i < d; i++) {
            leftroattebyone(arr, n);

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }

    }

    static void leftroattebyone(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];

        }
        arr[n - 1] = temp;

    }
}
