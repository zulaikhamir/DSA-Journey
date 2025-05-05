
public class lexicographic {

    public static void main(String[] args) {
        String str = "STRING";
        int rank = findRank(str);
        System.out.println("Lexicographic rank of " + str + " is: " + rank);
    }

    // Function to find factorial
    static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }

    // Function to calculate lexicographic rank
    static int findRank(String str) {
        int rank = 1;
        int n = str.length();
        int mul = fact(n);

        // To count occurrences of characters
        int[] count = new int[256];

        // Count frequency of each character in the string
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

        // Check for duplicate characters
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println("Duplicate characters not allowed");
                return -1;
            }
        }

        // Compute cumulative count
        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < n; i++) {
            mul /= n - i;

            // Count of chars smaller than str.charAt(i)
            int smaller = count[str.charAt(i) - 1];

            rank += smaller * mul;

            // Reduce count of characters greater than str.charAt(i)
            for (int j = str.charAt(i); j < 256; j++) {
                count[j]--;
            }
        }

        return rank;
    }

}
