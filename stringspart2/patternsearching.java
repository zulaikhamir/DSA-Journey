
public class patternsearching {

    public static void main(String[] args) {
        String text = "ummerazulaikhasaika muskaan";
        String pattern = "zulaikha";

        int x = pattern(text, pattern);
        if (x != -1) {
            System.out.println("Pattern is present at index: " + x);
        } else {
            System.out.println("Pattern is not present");
        }
    }

    // Function to search for pattern in text using naive approach
    static int pattern(String text, String pattern) {
        int m = text.length();
        int n = pattern.length();

        // Outer loop to check every possible starting index in text
        for (int i = 0; i <= m - n; i++) {
            int j;

            // Inner loop to check for pattern match starting at i
            for (j = 0; j < n; j++) {
                if (pattern.charAt(j) != text.charAt(i + j)) {
                    break;  // Break on first mismatch
                }
            }

            // If j reached n, it means whole pattern matched
            if (j == n) {
                return i;
            }
        }

        // Pattern not found
        return -1;
    }
}
