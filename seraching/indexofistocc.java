
public class indexofistocc {

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 6, 7, 4, 3, 9, 0};
        int n = arr.length;
        int x = 4;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("found at index " + i + " and is " + arr[i]);
                return;

            }
        }
        System.out.println("not found");

    }
}
