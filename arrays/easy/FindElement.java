public  class FindElement{
	public static void main(String[] args) {
		int n=5;
		int arr[]={10,20,30,60,100};
		int i=0;
		//int k=30;
		int k=50;
		for( i=0;i<n;i++){
			if(arr[i]==k){
				System.out.println("found at "+i);
			}

		}
//this is wrong logic the answer will be  found and not found both because the loop will be over and it will print not found at last
			System.out.println("not found");


	}
}
