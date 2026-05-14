public class Permutations {

    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }

    static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String ros = str.substring(0, i) + str.substring(i + 1);
// This removes str.charAt(i) from the string. Example with str = "abc" and i = 1:

// str.substring(0, 1) → "a" (everything before index 1)
// str.substring(2) → "c" (everything after index 1)
// ros → "a" + "c" → "ac"

// Character 'b' has been removed. This is how you avoid reusing the same character.

            permute(ros, result + ch);
        }
    }
}
