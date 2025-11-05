public class CountDigits{

	public static int digits(int n){
		if(n==0){
          return 0;
		}
		return 1 + digits(n/10);
	}
	public static void main(String[] args){
		// int n=123456789;
		// int count=0;
		// while(n!=0){
		// 	n=n/10;
		// 	count++;
			
		// }
		// System.out.println(count);
		int n=2345;
		System.out.println("no of digits are: "+digits(n));

	}


	}
