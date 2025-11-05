
public class FrequencyNaive {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 5, 6, 7, 8};
        int n = arr.length;

        // Array to mark visited elements
        boolean[] visited = new boolean[n];

        // Traverse the array elements
        for (int i = 0; i < n; i++) {
            // Skip this element if already counted
            if (visited[i]) {
                continue;
            }

            int count = 1; // Initialize frequency count

            // Compare with rest of the elements
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            // Print the element and its frequency
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
