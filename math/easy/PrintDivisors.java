// Print all the divisors of a number n in sorted order.
//what are divisors of a number n?
//Divisors of a number n are the numbers that divide n completely without leaving any remainder.
//For example, the divisors of 6 are 1, 2, 3, and 6, because these numbers divide 6 without leaving any remainder. The divisors of 12 are 1, 2, 3, 4, 6, and 12, because these numbers divide 12 without leaving any remainder. The divisors of 25 are 1, 5, and 25, because these numbers divide 25 without leaving any remainder. In general, the divisors of a number n include 1 and n itself, as well as any other numbers that can divide n without leaving a remainder.

//sorted order divisors
//example 20 will give ouput 1, 2, 4, 5, 10, 20
class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        int i=1;
        for(i=1;i*i<=n;i++){// to get the divisors less than or equal to sqrt(n)
            if(n%i==0)
            list.add(i);
        }
        i--;// to get the last value of i which is less than or equal to sqrt(n)
        for(;i>=1;i--){
            if(n%i==0 && (long)i * i != n){// to avoid adding the square root twice in case of perfect squares
                list.add(n/i);
            }
        }


        return list;
    }
}

//Print both divisors together immediately.
public class PrintDivisors {
    public static void main(String[] args) {

        int n = 25;

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                System.out.println(i);

                if (i != n / i) {// to avoid printing the square root twice in case of perfect squares
                    System.out.println(n / i);
                }
            }
        }
    }
}
