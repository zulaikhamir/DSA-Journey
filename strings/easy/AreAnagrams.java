import java.util.*;

public class AreAnagrams{
	public static void main(String[] args) {
		String s1="abcdf";
		String s2="acbfed";
		if(s1.length()!=s2.length())
		System.out.println("no anagram");

		char a[]=s1.toCharArray();
		Arrays.sort(a);
		s1= new String(a);

		char b[]=s2.toCharArray();
		Arrays.sort(b);
		s2= new String(b);

		if(s1.equals(s2))
		System.out.println("anagram");

	}
}