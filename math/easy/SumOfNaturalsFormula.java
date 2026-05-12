public class SumOfNaturalsFormula{

static int  sum(int n){
	if(n==0)
	return 0;
	else
	return n + sum(n-1);//this one is using recursion to calculate the sum of first n natural numbers. It works by adding n to the sum of the first n-1 natural numbers, which is calculated by calling the sum function recursively with n-1 as the argument. The base case is when n is 0, in which case the function returns 0, as the sum of the first 0 natural numbers is 0.

}



public static void main(String[] args) {
	int n=7;
	System.out.println(sum(n));
}


}


return n*(n+1)/2;//is the formula for sum of first n natural numbers. It is derived from the fact that the sum of the first n natural numbers can be expressed as the sum of an arithmetic series, where the first term is 1, the common difference is 1, and the number of terms is n. The formula can be derived using mathematical induction or by pairing the first and last terms of the series.
