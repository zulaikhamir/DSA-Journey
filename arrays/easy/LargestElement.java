public class LargestElement{
	public static void main(String[] args) {
		int arr[]={1,2,3,5,6,8,9,3,4,184};
		int max=arr[0];
		int n=arr.length;
		for(int i=0;i<n;i++){//loop should start at 1 ist comparision is useless
			if(arr[i]>max)
			max=arr[i];//if array is empty this line will crash  int max=arr[0];

		}
		System.out.println("max is: "+max);
	}
}
