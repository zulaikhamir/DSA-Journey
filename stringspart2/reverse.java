// Define a public class named 'reverse'

public class reverse {

    // Main method — entry point of the program
    public static void main(String[] args) {
        // Define a string to be reversed word by word
        String str = "welcome to kashmir";

        // Get the length of the string
        int n = str.length();

        // Convert the string into a character array for in-place modification
        char[] charArray = str.toCharArray();

        // Call reverseWords method to reverse the order of words in the char array
        reverseWords(charArray, n);

        // Convert the modified char array back to a string
        String result = new String(charArray);

        // Print the final reversed string
        System.out.println(result);
    }

    // Method to reverse individual words first, then the whole sentence
    static void reverseWords(char[] str, int n) {
        // Initialize the starting index of a word
        int start = 0;

        // Loop through each character in the array
        for (int end = 0; end < n; end++) {
            // If a space is found, reverse the word between 'start' and 'end-1'
            if (str[end] == ' ') {
                reversee(str, start, end - 1);
                // Move 'start' to the next word
                start = end + 1;
            }
        }

        // Reverse the last word (as it won't be followed by a space)
        reversee(str, start, n - 1);

        // Reverse the entire character array to get words in reverse order
        reversee(str, 0, n - 1);
    }

    // Method to reverse a portion of the char array between 'low' and 'high' indices
    static void reversee(char str[], int low, int high) {
        // Swap characters moving inwards from both ends
        while (low < high) {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }
}
