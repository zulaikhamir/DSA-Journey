public class ReverseString {

    public static void main(String[] args) {
        String input = "welcome to kashmir";

        char[] chars = input.toCharArray();

        reverseWords(chars);

        System.out.println(new String(chars));
    }

    // Reverses the order of words in the character array
    static void reverseWords(char[] chars) {
        int start = 0;

        // Reverse each word
        for (int end = 0; end < chars.length; end++) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }

        // Reverse the last word
        reverse(chars, start, chars.length - 1);

        // Reverse the entire array
        reverse(chars, 0, chars.length - 1);
    }

    // Reverses characters between two indices
    static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
