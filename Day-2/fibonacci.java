public class fibonacci{
	
	public static int fibonaccii(int n) {
		if(n <= 1) 
			return n;
		
		return fibonaccii(n-1) + fibonaccii(n-2);
	}

	public static void main(String[] args){
		int n=10;
		for(int i=0;i<n;i++){
			System.out.print(" "+fibonaccii(i));
		}
		
	} 
}