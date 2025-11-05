public class SubsequenceCheck{
	public static void main(String[] args) {
		// String str1="helloapple";
		// String str2="app";
		// String str1="boyman";
		// String str2="boy";
		// String str1="b";
		// String str2="boy";
		String str1="man";
		String str2="boy";
		int m=str1.length();
		int n=str2.length();
        int j=0;
		boolean isseq=false;

		if(m<n){
			System.out.println("no subsequnece");
		}
		else{
			for(int i=0;i<m && j<n;i++){
			if(str1.charAt(i)==str2.charAt(j)){
				j++;
			   isseq=true;
			}
			
		}
		if(!isseq)
		System.out.println("not subseq");
		else
		System.out.println(str2+" is subsequnce of "+str1 );
		}

		
	}
}