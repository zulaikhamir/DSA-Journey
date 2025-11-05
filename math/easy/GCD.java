public class GCD{
static int gcd2(int a,int b){
	int min=Math.min(a,b);
	for(int i=min;i>0;i--){
		if(a%i==0 && b%i==0){
			return i;
		}
	}
	return 1;
}


	public static void main(String[] args){
		int a=100;
		int b=18;
		System.out.println("gcd of two nos is :"+gcd2(a,b));	}

}