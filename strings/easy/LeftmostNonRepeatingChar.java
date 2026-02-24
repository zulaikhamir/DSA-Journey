public class LeftmostNonRepeatingChar {

    public static void main(String[] args) {
        String str = "zulaikha";

        int index = findLeftmostNonRepeatingIndex(str);

        if (index != -1) {
            System.out.println(
                "Leftmost non-repeating character is at index: "
                + index + " and is: " + str.charAt(index)
            );
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    // Returns the index of the leftmost non-repeating character
    static int findLeftmostNonRepeatingIndex(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            boolean isRepeating = false;

            for (int j = 0; j < n; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                return i;
            }
        }

        return -1;
    }
}
