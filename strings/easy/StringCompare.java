public class StringCompare{
	public static void main(String[] args) {
		String s1="Zulaikha";
		String s2="tabinda";
		String s4="Zulaikha";

		if(s1==s4)
		System.out.println("equal");
		else
		System.out.println("not equal");

		if(s1==s2){
			System.out.println("equal");

		}
		else{
			System.out.println("not equal");
		}
		

		String s3= new String("tabinda");
		if(s2==s3)
		System.out.println("equal");
		else
		System.out.println("not equal");
		
		if(s2.equals(s3))
		System.out.println("equal");
	}
}