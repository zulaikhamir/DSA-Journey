class DistinctPatternBrute {


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

    private static int pattern(String text, String pattern) {

    int m = text.length();
    int n = pattern.length();

    // Try every possible starting index
    for (int i = 0; i <= m - n; i++) {

        int j;

        // Check pattern from this starting index
        for (j = 0; j < n; j++) {
            if (text.charAt(i + j) != pattern.charAt(j)) {
                break; // mismatch
            }
        }

        // If we matched all characters
        if (j == n) {
            return i;
        }
    }

    // Pattern not found
    return -1;
    }
}
