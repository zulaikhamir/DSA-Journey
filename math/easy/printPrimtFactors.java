class printPrimeFactors{
    public static void main(String[] args) {
        int n=25;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){// if n is divisible by i, then we will print i and divide n by i until n is not divisible by i. this is because we want to print all the prime factors of n in sorted order.
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>1){// if n is a prime number greater than 1.why are we checking this condition? because if n is a prime number greater than 1, then it will not be printed in the above loop. so we need to check this condition to print the prime number.
            System.out.print(n);
        }
    }
}
