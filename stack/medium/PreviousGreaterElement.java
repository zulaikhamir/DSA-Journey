
public class PreviousGreaterElement {

    public static void main(String[] args) {//naive solution
        int[] arr = {1, 2, 5, 7, 3, 5, 9, 6, 0, 7};
        int j;
        for (int i = 0; i < arr.length; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.println(+arr[j]);
                    break;
                }

            }
            if (j == -1) {
                System.out.println(-1);
            }

        }

    }
}
