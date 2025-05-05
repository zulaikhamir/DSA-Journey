
public class lrceff2 {

    // Constant for total possible characters (extended ASCII)
    static final int CHAR = 256;

    public static void main(String[] args) {
        // Input string
        String str = "geeksforgeeks";

        // Length of the string
        int n = str.length();

        // Call the method to get the index of the leftmost repeating character
        int x = leftmost(str, n);

        // Check if any repeating character exists
        if (x != -1) {
            // If found, print its index and the character
            System.out.println("Repeating character is at index: " + x + " and is: " + str.charAt(x));
        } else {
            // If not found, print a message
            System.out.println("No repeating character found.");
        }
    }

    // Method to find index of leftmost repeating character
    static int leftmost(String str, int n) {
        // Boolean array to mark visited characters (initialized as false by default)
        boolean[] visited = new boolean[CHAR];

        // Initialize result to -1 (if no repeating character is found)
        int res = -1;

        // Traverse string from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (visited[str.charAt(i)]) {
                // If character already visited, update result with current index
                res = i;
            } else {
                // Otherwise, mark it as visited
                visited[str.charAt(i)] = true;
            }
        }

        // Return result (either index or -1)
        return res;
    }
}
