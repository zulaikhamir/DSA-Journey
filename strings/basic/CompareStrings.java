public class CompareStrings{
	public static void main(String[] args) {
		String s1="zulaikha";
		String s2="zula";

		s1=s1+"meow";
		s1=s1.concat("maaaaaa");
		System.out.println(s1);

		int res=s1.compareTo(s2);

		System.out.println(s1.indexOf(s2));
		System.out.println(s2.indexOf(s1));

		if(res>0)
		System.out.println("s1 greater");
		if(res<0)
		System.out.println("s2 greater");
		if(res==0)
		System.out.println("same");
	}
}