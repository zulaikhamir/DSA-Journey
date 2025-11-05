public class PrintOneToN{

	static void  print(int n){
		if(n==0)
		return;
		
		print(n-1);
		System.out.println(n+"");
		//print(n-1);//tail recuriosn if recursive call is the last call in a function
	}
	public static void main(String[] args) {
		int n=8;
		print(n);
	}
}