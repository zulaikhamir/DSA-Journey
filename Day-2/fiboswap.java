public class fiboswap{
	public static void main(String[] args){
		int n =8;

	int a=0;
	int b=1;
	int c=0;
	for(int i=2;i<n;i++){
		c=b+a;
		a=b;
		b=c;
		System.out.println(c);

	}
	
	}
}