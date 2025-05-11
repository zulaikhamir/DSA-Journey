
public class twopointer {//check if array has a pair with given sum
    // we use two pointer approach for sorted arrays if we have unsosrted array we use naive solution

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 4, 8, 5, 3};
        int x = 11;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println("yess and the nos are :" + arr[i] + "and " + arr[j]);
                }
            }
        }

    }
}
