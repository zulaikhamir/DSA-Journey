public  class insertionSort{
	public static void main(String[] args) {
		int[] arr={1 ,2 ,3 ,5 ,7 ,9 ,0 ,11 ,5 };
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int num:arr){
			System.out.print(num);
		}
		
		
	}
}