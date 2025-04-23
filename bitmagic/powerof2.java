class powerof2{
	public static void main(String[] args) {
		int n=7;
		if(n==0){
				System.out.println("fasle");
				return;
		}
	

		while(n!=1){
			if(n%2!=0){
				System.out.println("fasle");
				return;
			}
			n=n/2;
		}
		System.out.println("yes");
	}
}

/* 	multi line comment also known as block line comment 
I want the rest of the code to execute if this condition is met?"

If no, then you need a return.

In this case:

If n % 2 != 0 and n != 1, it means n is not a power of 2.

So printing "false" and returning immediately prevents "yes" from being printed wrongly.*/