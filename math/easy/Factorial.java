// public class ok{
// 	public static void main(String[] args){
// 		int n=5;

// 		int result=1;
// 		for(int i=2;i<=n;i++){
// 			result=result*i;
// 		}
// 		System.out.println("The factorial of " + n + " is: " + result);

// 	}
// }
public class Factorial{

	public static int fact(int n){
		if(n==0 || n==1)
		return 1;
		return n * fact(n-1);
	}
	public static void main(String[] args){
	int n=20;
	System.out.println("factorial is :"+fact(n));
	}
}