public class TrailingZerosEfficient {

	static int trailingZeroes(int n){

		int count=0;
		for(int i=5;i<=n;i=i*5){
			
			//count=count+n/i;
			int temp = n/i;
            count = count + temp;
			
	
		}
		return count;
	}

public static void main(String[] args){
	int n=8;
	System.out.println("No of trailing zeroes in " + n + "! is: " + trailingZeroes(n));

}

}

