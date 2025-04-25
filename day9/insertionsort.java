public class insertionsort{
	public static void main(String[] args) {
		int arr[]={3,2,5,6,8,4,3,9,0};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++){
				if(arr[j-1]>arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;

				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	}
}