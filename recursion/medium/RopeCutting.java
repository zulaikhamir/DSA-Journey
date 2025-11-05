
public class RopeCutting {

    public static void main(String[] args) {
        int n = 20;
        int a = 8, b = 3, c = 6;

        int res = cutrope(n, a, b, c);
        System.out.println("max cut: " + res);
    }

    static int cutrope(int n, int a, int b, int c) {
        if (n < 0) {// Base case: if rope length is negative, not possible to cut further
            return -1;
        }
        if (n == 0) { // Base case: if rope length is exactly zero, no more cuts needed
            return 0;
        }
//Math.max takes only two parameters thats why we do it like this
        int res = Math.max(Math.max(cutrope(n - a, a, b, c), cutrope(n - b, a, b, c)), cutrope(n - c, a, b, c));
        if (res == -1) {
            return -1;
        }
        return res + 1;

    }

}
