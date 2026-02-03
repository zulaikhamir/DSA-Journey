
import java.util.Arrays;

public class LeftmostNonRepeatingCharEfficient {

    // Total possible characters (ASCII)
    static final int CHAR = 256;

    public static void main(String[] args) {
        String str = "zulaikha";
        int n = str.length();
        int x = nonrepeating(str, n);

        if (x != -1) {
            System.out.println("Leftmost non-repeating character is at index: " + x + " and is: " + str.charAt(x));
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    static int nonrepeating(String str, int n) {
        // Array to store the index of first occurrence of every character
        // If a character repeats, its value is set to -2
        int[] fi = new int[CHAR];

        // Initialize all values in fi[] to -1
        Arrays.fill(fi, -1);

        // Traverse the string and fill fi[]
        for (int i = 0; i < n; i++) {
            if (fi[str.charAt(i)] == -1) {
                // If character is seen for the first time, store its index
                fi[str.charAt(i)] = i;
            } else {
                // If character is repeating, mark it as -2
                fi[str.charAt(i)] = -2;
            }
        }

        // Initialize result with a large value
        int res = Integer.MAX_VALUE;

        // Find the minimum index of a non-repeating character
        for (int i = 0; i < CHAR; i++) {
            if (fi[i] >= 0) {  // corrected (it was > 0 — should be >= 0 to include index 0)
                res = Math.min(res, fi[i]);
            }
        }

        // If no non-repeating character found, return -1
        // Small bug fix here — it was 'res = Integer.MAX_VALUE' (assignment), should be '=='
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

}
