
public class CountDistinctNaive {

    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 5, 6, 7, 8, 6};

        int n = arr.length;
        int count = 0;

        // Loop through each element of the array
        for (int i = 0; i < n; i++) {
            boolean isDistinct = true;

            // Check if arr[i] has appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }

            // If element is distinct, increase count
            if (isDistinct) {
                count++;
            }
        }

        // Print the total number of distinct elements
        System.out.println("Total number of distinct elements: " + count);
    }
}
