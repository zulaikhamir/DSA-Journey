public class ReverseArray{
	public static void main(String[] args) {
		int arr[]={1,6,5,7,8,9,0};
		int n=arr.length;
		for(int i=0;i<n/2;i++){//n/2 we need to go only till half of array

				int temp=arr[i];
				arr[i]=arr[n-1-i];//n-1-i means n is size of array but index is n-1 for ist
				arr[n-1-i]=temp;//iteration i is 0 and when lhs i inrasing we are decreasing from back also

			                     //remember we are just reversing not sortinggggggggggg

		}
		for(int i=0;i<n;i++)
		System.out.print(" "+arr[i]);
	}
}
