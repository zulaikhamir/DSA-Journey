public class SubsequenceCheck {
    public static void main(String[] args) {

        String str1 = "man";
        String str2 = "boy";

        int m = str1.length();
        int n = str2.length();

        int j = 0; // pointer for str2

        // If str2 is longer, it cannot be a subsequence
        if (m < n) {
            System.out.println("not subseq");
            return;
        }

        // Traverse str1
        for (int i = 0; i < m && j < n; i++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
        }

        // Final decision
        if (j == n) {
            System.out.println(str2 + " is subsequence of " + str1);
        } else {
            System.out.println("not subseq");
        }
    }
}
