public class jagged{
	public static void main(String[] args){

		int m=3;
		int [][] arr= new int[m][];
		int i,j=0;

		for( i=0;i<arr.length;i++){
			arr[i]=new int[i+1];
			for( j=0;j<arr[i].length;j++){
				arr[i][j]++;
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}


	}
}