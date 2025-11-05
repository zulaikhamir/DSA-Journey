
public class LeftmostNonRepeatingCharBetter {

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
        int[] count = new int[CHAR];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < n; i++) {
            if (count[str.charAt(i)] == 1);
            return i;
        }

        return -1;

    }
}
