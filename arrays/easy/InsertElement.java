public class InsertElement{//logic is wrong in whole problem but idea is correct
	public static void main(String[] args) {
		int n=6;
		int arr[]= new int[n];//this logic has lot of bugs and it is not working as expected
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
		System.out.println("array full!");//no return statement everything is vague and not clear
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
