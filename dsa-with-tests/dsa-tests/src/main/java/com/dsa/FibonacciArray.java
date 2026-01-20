//Generate the first n Fibonacci numbers and return them.”
package com.dsa;
public class FibonacciArray {

    // This is the method we will TEST
    public static int[] generate(int n) {

        if (n <= 0) {
            return new int[0];
        }

        int[] f = new int[n];
        f[0] = 0;

        if (n > 1) {
            f[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f;
    }

    // main() is ONLY for running manually
    public static void main(String[] args) {
        int[] result = generate(10);

        System.out.print("Fibonacci is: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
