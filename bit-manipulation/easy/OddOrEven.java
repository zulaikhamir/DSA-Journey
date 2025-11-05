// class odd{
// 	public static void main(String[] args) {
// 		int res=0;
// 		int arr[]={1,1,2,2,2,3,3};
// 		for(int i=0;i<arr.length;i++){
// 			res=res^arr[i];
			
// 		}
// 		System.out.println(res);
		
// 	}
// }

class odd{//naive solution
	public static void main(String[] args) {
		int arr[]={1,2,3,4,1,2,3,4,5,5,5,5,5};
		boolean[] printed= new boolean[arr.length];

		
		for(int i=0;i<arr.length;i++){
			if(printed[i]) continue;
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				printed[j]=true;
				}
				
			}
			if(count%2!=0){
				System.out.println(arr[i]);
			}
		}
	}
}