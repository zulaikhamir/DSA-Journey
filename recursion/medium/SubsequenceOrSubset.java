
public class SubsequenceOrSubset {

    public static void main(String[] args) {
        String str = "abc";
        int i = 0;
        String cur = "";
        subsets(str, cur, i);

    }

    static void subsets(String str, String cur, int i) {

        if (i == str.length()) {
            //// Base case: if index reaches the end of string
            System.out.println(cur);
            return;
        }
        subsets(str, cur, i + 1); // Recursive case 1: exclude the current character and move to next
        subsets(str, cur + str.charAt(i), i + 1);// Recursive case 2: include the current character and move to next

    }
}
