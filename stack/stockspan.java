
public class stockspan {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 3, 5, 9, 6, 0, 7};
        for (int i = 0; i < arr.length; i++) {
            int span = 1;
            for (int j = i - 1; j >= 0 && arr[j] <= arr[i]; j--) {
                span++;
            }
            System.out.println(+span);
        }
    }
}
