
public class ar{
	


	static void arr2(int [][] arr){
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		int m=3;
		int n=4;
		int[][] arr= new int[m][n];
		//arr2(arr,m,n);
		arr2(arr);
	}
}