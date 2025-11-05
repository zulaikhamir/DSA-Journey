
public class SearchInInfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 10, 15, 20, 40, 60, 90, 100, 120, 500};
        int z = 70;

        int x = search(arr, z);
        if (x > 0) {
            System.out.println("found at: " + x);
        } else {
            System.out.println("not present");
        }

    }

    static int search(int[] arr, int z) {
        int i = 0;
        while (true) {
            if (arr[i] == z) {
                return i;
            }
            if (arr[i] > z) {
                return -1;
            }
            i++;
        }

    }

}
