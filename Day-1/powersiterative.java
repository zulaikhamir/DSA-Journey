
public class powersiterative {

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int res = power(x, n);
        System.out.println(res); // Output: 8
    }

    // Efficient iterative power function using exponentiation by squaring
    static int power(int x, int n) {
        int res = 1;

        while (n > 0) {
            // If the last bit of n is set (i.e., n is odd) In binary:

            if ((n & 1) == 1) {
                res *= x;
            }

            // Square the base
            x *= x;

            // Move to next bit by dividing n by 2
            n >>= 1; // same as n = n / 2;
        }

        return res;
    }
}
