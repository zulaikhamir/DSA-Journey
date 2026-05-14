
import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int n = 30;
        sieve(n);
    }

    static void sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];//initialise a boolean array of size n+1 to store the prime status of each number from 0 to n. we are using n+1 because we want to include n in our array.
        Arrays.fill(isPrime, true); // Assume all numbers are prime
        isPrime[0] = isPrime[1] = false;// 0 and 1 are not prime numbers

        for (int i = 2; i * i <= n; i++) {// We only need to check up to the square root of n because if n is divisible by any number greater than its square root, it must have a corresponding divisor that is smaller than the square root.
            if (isPrime[i]) {
                // Mark all multiples of i as non-prime
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
