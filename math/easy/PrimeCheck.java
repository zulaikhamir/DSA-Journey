
//prime number is a number which is only divisible by 1 and itself
public class PrimeCheck{
	static boolean isprime(int n){
		if(n==1)
		return false;
		if(n==2 || n==3)
		return true;
		if(n%2==0 || n%3==0)
		return false;
		else{
			//for(int i=2;i<n;i++)//naive
			//for(int i=2;i*i<n;i++){//efficient
			for(int i=5;i*i<=n;i=i+6){//why are we not checking for i=4 and i=6 because we have already checked for 2 and 3 .2*2=4 and 3*2=6
			//why are we doing i*i<n because if n is divisible by any number greater than sqrt(n) then it must be divisible by a number smaller than sqrt(n)
				if(n%i==0 || n%(i+2)==0)//we are checking for i and i+2 because we are skipping even numbers
				//how is doing i+2 skipping even numbers because we are starting from 5 and then we are checking for 7 and then we are checking for 11 and then we are checking for 13 and so on
				return false;


			}
			return true;
			}

	}
	public static void main(String[] args) {
		int n=17;

		System.out.println(isprime(n));
	}
}
