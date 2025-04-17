public class fiboarr{
	public static void main(String[] args){
		int n=10;
		int f[]= new int[n+1];
		f[0]=0;
		f[1]=1;
		int i=0;
		System.out.print("fibonacci is : "+f[0]+" "+f[1]);
		
		for( i=2;i<n;i++){
			f[i]=f[i-1]+f[i-2];
			System.out.print(" "+f[i]);
		}
		//return f[n];
		
	}
}