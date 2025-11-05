class brainkerningams{
	public static void main(String[] args) {
		int n=7;
		int res=0;
		while(n>0){
			n=n&(n-1);//if we subtract 1 from a no all the bits to lhs of set bit gets set to 1 and the set bit itself gets set to 0
			res++;
		}
		System.out.println(res);
	}
}