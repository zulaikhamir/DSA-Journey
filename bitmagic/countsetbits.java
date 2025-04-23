class countsetbits{
	public static void main(String[] args) {
		int n=5;
	int res=0;

	while(n>0){
		if((n&1)==1)
		res++;
		n=n>>1;
	}
	System.out.println(+res);
	}
	
}