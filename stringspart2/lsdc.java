
public class lsdc {

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Length of longest substring with all distinct characters: " + longestUniqueSubstr(str));
    } // Function to check if all characters are unique in a substring

    static boolean areDistinct(String str, int start, int end) {
        for (int i = start; i <= end; i++) {//Loops through every character in the substring
            for (int j = i + 1; j <= end; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Function to find length of longest substring with all unique characters
    static int longestUniqueSubstr(String str) {
        int n = str.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (areDistinct(str, i, j)) {//for each substring from i to j, it checks:
                    maxLen = Math.max(maxLen, j - i + 1);
                    //If the substring is unique, calculate its length: j - i + 1

//Update maxLen if this length is greater than the previous value of maxLen
                }
            }
        }

        return maxLen;
    }

}
