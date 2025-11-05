public class LargestElement{
	public static void main(String[] args) {
		int arr[]={1,2,3,5,6,8,9,3,4,184};
		int max=arr[0];
		int n=arr.length;
		for(int i=0;i<n;i++){
			if(arr[i]>max)
			max=arr[i];
			
		}
		System.out.println("max is: "+max);
	}
}