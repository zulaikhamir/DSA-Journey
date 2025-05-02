
public class powerset {

    public static void main(String[] args) {

        String str = "fambi";
        powersets(str);

    }

    static void powersets(String str) {
        int n = str.length();

        int totalsets = (int) Math.pow(2, n);

        for (int i = 0; i < totalsets; i++) {

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    // This line uses bitwise operations to check if the j-th bit of the integer i is set to 1. If it is,
                    //  the condition becomes true, meaning the corresponding element (in the powerset) should be included.
                    System.out.print(str.charAt(j));
                }

            }
            System.out.println();
        }
    }

}
