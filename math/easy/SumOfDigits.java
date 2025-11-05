public class SumOfDigits{

static int sum(int n){
	if(n==0)
	return 0;
	return sum(n/10) + n%10;
}

	public static void main(String[] args) {
		int n=123456;
		System.out.println(sum(n));
		}
}