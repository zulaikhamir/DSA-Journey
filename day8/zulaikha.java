public class zulaikha{
	public static void main(String[] args) {
		int m=4;
		int n=3;
		int [][] arr= new int[m][n];
		for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
		arr[i][j]=i+j;

		for(int i=0;i<m;i++){
       for(int j=0;j<n;j++){
		System.out.print(arr[i][j]+" ");
		}	
	System.out.println();

	}
}
}