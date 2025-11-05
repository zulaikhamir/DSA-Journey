public class TrailingZeros {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
    static int trailingZeroes(int n) {
        int fact = factorial(n);
        int count = 0;
        
        while (fact % 10 == 0) {
            count++;
            fact = fact / 10;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        System.out.println("No of trailing zeroes in " + n + "! is: " + trailingZeroes(n));
    }
}