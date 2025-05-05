
public class leftmostrepeatingchar {

    public static void main(String[] args) {
        String str = "ab";
        int n = str.length();
        leftmost(str, n);

    }

    static void leftmost(String str, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {

                    System.out.println("letf most repeating char is : " + str.charAt(i) + " at index " + i);
                    return;
                }

            }

        }
        System.out.println("not there");

    }
}
