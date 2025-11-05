public  class invertedpyramid{
	public static void main(String[] args) {
		int m=5;
		int i=0;
		int j=0;
		for(j=0;j<m;j++){
			for(i=0;i==j;i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}