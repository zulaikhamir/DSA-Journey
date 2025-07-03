
public class LongestConsecutiveSubsequence {

    static int findLongestConseqSubseq(int[] arr, int n) {
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = arr[i];
            int count = 1;

            // Check for next elements
            for (int j = 0; j < n; j++) {
                if (arr[j] == currentNum + 1) {
                    currentNum++;
                    count++;
                    j = -1; // Start again from beginning
                }
            }

            if (count > maxLen) {
                maxLen = count;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        int n = arr.length;
        System.out.println("Length of the longest consecutive subsequence is: "
                + findLongestConseqSubseq(arr, n));
    }
}
