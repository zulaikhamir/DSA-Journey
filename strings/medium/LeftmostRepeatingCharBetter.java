// Define a public class named 'lrcbetterapproach' (LRC = Leftmost Repeating Character)

public class LeftmostRepeatingCharBetter {

    // Define a constant for the number of possible characters (extended ASCII)
    static final int CHAR = 256;

    // Main method — entry point of the program
    public static void main(String[] args) {
        // Define the input string
        String str = "geeks for geeks";

        // Get the length of the string
        int n = str.length();

        // Call the method to find the index of the leftmost repeating character
        leftmost(str, n);
    }

    // Method to find and print the index of the leftmost repeating character
    static void leftmost(String str, int n) {
        // Create an integer array to store frequency counts of all characters
        int[] count = new int[CHAR];

        // First loop: Traverse the string and count occurrences of each character
        for (int i = 0; i < n; i++) {
            // str.charAt(i) gives the character at position i, used as index for count array
            count[str.charAt(i)]++;
        }

        // Second loop: Traverse the string again to find the first character with count > 1
        for (int i = 0; i < n; i++) {
            if (count[str.charAt(i)] > 1) {
                // Print the index of the leftmost repeating character
                System.out.println(i);
                return; // Exit after finding the first one
            }
        }

        // If no repeating character is found, print this message
        System.out.println("not found");
    }
}
