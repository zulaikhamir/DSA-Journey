public class checksorted{
	public static void main(String[] args) {
		int arr[]={1,2,3,8,5,6};
		int n =arr.length;
		boolean sorted=true;
		for(int i=1;i<n;i++){
			if(arr[i]<arr[i-1]){
				sorted=false;
			break;
			}
			
		}
		
		if(!sorted){
			System.out.println(" not sorted");
		}	
		else{
			System.out.println("sorted");
		}
         
		
	}
}