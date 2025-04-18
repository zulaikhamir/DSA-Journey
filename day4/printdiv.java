public class printdiv{
	public static void main(String[] args) {
		int n=25;
		// for (int i=1;i*i<=n;i++){
		// 	if(n%i==0){
		// 		System.out.println(i);
		// 	if (i != n / i) { 
        //             System.out.println(n / i); 
        //         }
		// 	}
			
		// }
		int i=0;
		for(i=1;i*i<=n;i++){
			if(n%i==0){
				System.out.println(i);
				
			}
		}

	
		for(;i>0;i--){
			if(n%i==0){
				if (n / i != i){
						System.out.println(n/i);
				}
			
			}
		}
	}
}

