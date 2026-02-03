// Import Arrays utility for using Arrays.fill method

import java.util.Arrays;

// Define a public class for the program
public class LeftmostRepeatingCharEfficient1 {

    // Define a constant for number of possible characters (extended ASCII)
    static final int CHAR = 256;

    // Main method — entry point of the program
    public static void main(String[] args) {
        // Define the input string
        String str = "geeksfor geeks";

        // Get the length of the string
        int n = str.length();

        // Call the method to find the index of the leftmost repeating character
        int x = leftmost(str, n);

        // Print the result — index and the character itself
        System.out.println("left most is at index: " + x + " and is " + str.charAt(x));
    }

    // Method to find the index of the leftmost repeating character
    static int leftmost(String str, int n) {
        // Create an integer array to track first occurrence index of each character
        int[] findex = new int[CHAR];

        // Initialize all values in findex array to -1, meaning no character seen yet
        Arrays.fill(findex, -1);

        // Variable to store the result (minimum index of any repeating character)
        int res = Integer.MAX_VALUE;

        // Traverse the string one character at a time
        for (int i = 0; i < n; i++) {
            // Get first occurrence index of current character
            int fi = findex[str.charAt(i)];

            if (fi == -1) {
                // If character is seen for the first time, record its index
                findex[str.charAt(i)] = i;
            } else {
                // If character was seen before, update 'res' with the minimum index found so far
                res = Math.min(res, fi);
            }
        }

        // If no repeating character was found, return -1
        // Otherwise, return the index of the leftmost repeating character
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}
