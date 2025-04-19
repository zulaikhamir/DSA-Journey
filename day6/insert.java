public class insert{
	public static void main(String[] args) {
		int n=6;
		int arr[]= new int[n];
		arr[0]=1;
		arr[1]=2;
		arr[2]=7;
		arr[3]=4;
		arr[4]=6;
		System.out.println("before insert");
		for (int i = 0; i < n; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		int pos=3;
		int x=8;
		int cap=4;

		if(n==cap)
		System.out.println("array full!");
		int idx=pos-1;
		for(int i=n-1;i>idx;i--){
			arr[i]=arr[i-1];
			
		}
		arr[idx]=x;
		System.out.println("array elements are: ");
		for(int i=0;i<n;i++){
			System.out.print(" "+arr[i]);
		}





	}
}