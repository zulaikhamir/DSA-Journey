public class prime{
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
			for(int i=5;i*i<n;i=i+6){
				if(n%i==0 || n%(i+2)==0)
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