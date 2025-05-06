
public class lastocc {//iterative

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 7, 8, 8};
        int n = arr.length;
        int x = 5;
        int low = 0;
        int high = n - 1;
        int z = firstocc(arr, low, high, x);
        if (z > 0) {
            System.out.println(z);
        } else {
            System.out.println("not present");
        }

    }

    static int firstocc(int[] arr, int low, int high, int x) {
        int n = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x > arr[mid]) {
                low = mid + 1;
            } else {
                if (x < arr[mid]) {
                    high = mid - 1;
                } else if (mid == (n - 1) || arr[mid + 1] != arr[mid]) {//this different in ist and last occ
                    return mid;

                
                      ///here we are returning our answer
                } else {
                    low = mid + 1;//this condition different in ist and last occ
                }
            }
        }
        return -1;
    }

}
