//what this problem asks is that we have to find the number of subsets in the given array whose sum is equal to the given sum
public class SubsetSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 8;
        int n = arr.length;
        int res = sum(arr, n, sum);
        System.out.println(res);

    }

    static int sum(int arr[], int n, int sum) {

        if (n == 0) {
            return (sum == 0) ? 1 : 0;//if the sum is 0 then we have found a subset whose sum is equal to the given sum so we return 1 otherwise we return 0
        }

       return sum(arr, n - 1, sum) //not including the last element
     + sum(arr, n - 1, sum - arr[n - 1]);//including the last element
    }
}
