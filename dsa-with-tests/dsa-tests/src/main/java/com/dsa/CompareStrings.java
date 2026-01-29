public class CompareStrings {

    public static void main(String[] args) {

        // Input strings
        String s1 = "zulaikha";
        String s2 = "zula";

        // Modify s1 and store the final result
        String modifiedS1 = buildModifiedString(s1);

        // Print the modified string
        printModifiedString(modifiedS1);

        // Compare both strings lexicographically
        compareStrings(modifiedS1, s2);

        // Check substring positions
        printSubstringIndexes(modifiedS1, s2);
    }

    /**
     * Creates a new string by appending values to the original string.
     * Strings are immutable, so a new String object is returned.
     */
    private static String buildModifiedString(String original) {
        original = original + "meow";          // Creates a new String
        original = original.concat("maaaaaa"); // Creates another new String
        return original;
    }

    /**
     * Prints the final modified string.
     */
    private static void printModifiedString(String value) {
        System.out.println(value);
    }

    /**
     * Compares two strings using compareTo and prints which one is greater.
     */
    private static void compareStrings(String s1, String s2) {
        int result = s1.compareTo(s2);

        // compareTo returns:
        //  > 0 if s1 is lexicographically greater
        //  < 0 if s1 is lexicographically smaller
        //  = 0 if both strings are equal
        if (result > 0) {
            System.out.println("s1 is greater than s2");
        } else if (result < 0) {
            System.out.println("s2 is greater than s1");
        } else {
            System.out.println("Both strings are the same");
        }
    }

    /**
     * Finds and prints the index of one string inside another.
     */
    private static void printSubstringIndexes(String s1, String s2) {

        // indexOf returns:
        //  starting index if found
        //  -1 if not found
        System.out.println(s1.indexOf(s2));
        System.out.println(s2.indexOf(s1));
    }
}
