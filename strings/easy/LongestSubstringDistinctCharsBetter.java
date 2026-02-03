
public class LongestSubstringDistinctCharsBetter {

    // Function to find length of longest substring with all unique characters
    static int longestUniqueSubstr(String str) {
        int n = str.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {                   // O(N)
            boolean[] visited = new boolean[256];       // O(1)

            for (int j = i; j < n; j++) {               // O(N)
                if (visited[str.charAt(j)]) {           // O(1)
                    break; // duplicate found, break inner loop
                } else {
                    visited[str.charAt(j)] = true;
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
