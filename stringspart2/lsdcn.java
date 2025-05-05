
import java.util.Arrays;

public class lsdcn {

    static int longestUniqueSubstr(String str) {
        int n = str.length();
        int[] lastSeen = new int[256];  // for ASCII characters

        Arrays.fill(lastSeen, -1);  // initialize all positions as -1 (not seen)

        int maxLen = 0;
        int start = 0;  // start of current window

        for (int end = 0; end < n; end++) {
            char currentChar = str.charAt(end);

            // If currentChar was seen after or at 'start', move start to one after its last seen position
            start = Math.max(start, lastSeen[currentChar] + 1);

            // Update maxLen if current window length is greater
            maxLen = Math.max(maxLen, end - start + 1);

            // Update last seen index of currentChar
            lastSeen[currentChar] = end;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Length of longest substring with all distinct characters: " + longestUniqueSubstr(str));
    }
}
