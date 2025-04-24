class twoodd{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,1,2,3,4,5,8};
		int res1=0;
		int res2=0;
		int xor=0;
		for(int i=0;i<arr.length;i++){
			xor=xor^arr[i];

		}
		int lastbitset=xor&(~(xor-1));
		for(int i=0;i<arr.length;i++){
			if(((arr[i]&lastbitset)!=0))
			{
				res1=res1^arr[i];
			}
			else{
				res2=res2^arr[i];
			}
		}
		System.out.println("ist "+res1+" 2nd "+res2);

	}
}