
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
        int rank = 1;//if 0 then add 1 to end 
        int n = str.length();
        int mul = fact(n);

        // Count of each character in ASCII order
        int[] count = new int[256];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

        // Cumulative count — so we can know how many characters are less than a given character
        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < n; i++) {
            mul /= (n - i); // Number of permutations for remaining characters

            // Number of characters smaller than str.charAt(i)
            int smaller = count[str.charAt(i) - 1];

            // Add permutations that would appear before the current prefix
            rank += smaller * mul;

            // Reduce count of characters greater than or equal to str.charAt(i)
            for (int j = str.charAt(i); j < 256; j++) {
                count[j]--;
            }
        }

        return rank;
    }

}
