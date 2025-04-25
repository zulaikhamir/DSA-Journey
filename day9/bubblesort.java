// public class bubblesort{
// 	public static void main(String[] args) {
// 		int arr[]={3,2,5,6,8,4,3,9,0};
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			for(int j=1;j<arr.length;j++){//j<n-i-1
// 				if(arr[j-1]>arr[j]){
// 					int temp=arr[j-1];
// 					arr[j-1]=arr[j];
// 					arr[j]=temp;

// 				}
// 			}
// 		}
// 		for(int i=0;i<arr.length;i++)
// 		System.out.print(arr[i]);
// 	}
// }

//optimised bubble sort
public class bubblesort{
	public static void main(String[] args) {
		int arr[]={3,2,5,6,8,4,3,9,0};
		for(int i=0;i<arr.length;i++)
		{   boolean swapped=false;
			for(int j=1;j<arr.length-i;j++){//j<n-i-1
				if(arr[j-1]>arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swapped=true;

				}
			}if(!swapped){
			break;
		}
		}
		
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	}
}