public class search{
	public static void main(String[] args) {
		int k=3;
		int arr[ ]={1,4,3,5};
		boolean found=false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==k){
				System.out.println("found at "+i);
			found=true;
			break;
			}
			
			
		}
		if(!found){
			System.out.println("not found");
		}
		
		
		
	}
}