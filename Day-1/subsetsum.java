
public class subsetsum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 8;
        int n = arr.length;
        int res = sum(arr, n, sum);
        System.out.println(res);

    }

    static int sum(int arr[], int n, int sum) {

        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }

        return sum(arr, n - 1, sum) + sum(arr, n - 1, sum - arr[n - 1]);//one side you include the the ele from array and subtarct and other you dont then you add tem sum results in result

    }
}
