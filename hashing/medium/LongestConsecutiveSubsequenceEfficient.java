
import java.util.HashSet;

public class LongestConsecutiveSubsequenceEfficient {

    static int findLongestConseqSubseq(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();

        // Insert all array elements into set
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int maxLen = 0;

        // Check each possible sequence starting number
        for (int num : set) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
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
