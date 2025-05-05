
public class lsdc {

    // Function to check if all characters are unique in a substring using boolean array
    static boolean areDistinct(String str, int start, int end) {
        boolean[] visited = new boolean[256]; // for ASCII characters

        for (int i = start; i <= end; i++) {
            if (visited[str.charAt(i)]) {
                return false;
            }
            visited[str.charAt(i)] = true;
        }
        return true;
    }

    // Function to find length of longest substring with all unique characters
    static int longestUniqueSubstr(String str) {
        int n = str.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {            // O(N)
            for (int j = i; j < n; j++) {        // O(N)
                if (areDistinct(str, i, j)) {    // O(N)
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Length of longest substring with all distinct characters: " + longestUniqueSubstr(str));
    }
}
