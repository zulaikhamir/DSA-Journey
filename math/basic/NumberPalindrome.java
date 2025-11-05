public class NumberPalindrome{
	public static void main(String[] args){
		int n= 487684;
		int rev=0;
		int temp=n;
		while(temp!=0){
			int ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10;
		
		}
		if(n==rev){
          System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
		}
	}
