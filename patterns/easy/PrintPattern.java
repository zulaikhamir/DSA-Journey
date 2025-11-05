public class PrintPattern{
	public static void main(String[] args) {
		int[][] arr = { {1, 2}, {3, 4}, {5, 6} };

		//int arr[3][2]={{1,2},{3,4},{5,6}};// this is a c style array or c++
		for(int i=0;i<3;i++)
		for(int j=0;j<2;j++)
		System.out.println(arr[i][j]);
	}
}