
public class lnrc {

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

    // Function to find the index of the leftmost non-repeating character
    static int nonrepeating(String str, int n) {
        // Loop through each character of the string
        for (int i = 0; i < n; i++) {
            boolean flag = false; // Assume current char is unique initially

            // Compare current character with every other character
            for (int j = 0; j < n; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = true;  // Found a duplicate
                    break;
                }
            }

            // After inner loop, if no duplicate was found, return current index
            if (flag == false) {
                return i;
            }
        }

        // If no non-repeating character found, return -1
        return -1;
    }
}
