public class GcdEuclid{
	static int gcd(int a,int b){
		// while(a!=b){
		// 	if(a>b){
		// 		a=a-b;
		// 	}else{
		// 		b=b-a;

		// 	}
		// 	//gcd(a,b)=gcd(a-b,b)
		// }
		// return a;
		if(b==0){
			return a;
		}
		else{
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args){
		int a=1000;
		int b=1899;
		System.out.println("gcd of two nos is :"+gcd(a,b));	
	}

}