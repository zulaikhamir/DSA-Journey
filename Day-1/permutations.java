
public class permutations {

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("\"\"");
        permute(str, "");
    }

    static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1); // ros means rest of string
            String ans = result + ch;
            permute(ros, ans);
        }
    }
}
