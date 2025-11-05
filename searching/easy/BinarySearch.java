public class BinarySearch{
	public static void main(String[] args) {
		int [] arr={10, 20, 30, 40, 50, 60, 70};
		int low=0;
		int n=arr.length;
		int high=n-1;
		int k=20;

		while(low<=high){
			int  mid=(low+high)/2;

			if(arr[mid]==k){
				System.out.println("found at "+mid);
				return;
			}

			
			else{
				if(arr[mid]<k){
					low=mid+1;
				}
			
			else {
				high=mid-1;
			}
			
			}
			
		}
	}
}