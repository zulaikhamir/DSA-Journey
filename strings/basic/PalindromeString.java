import java.util.*;
public class PalindromeString{
	public static void main(String[] args) {
		
            try (Scanner sc = new Scanner(System.in)) {
                String str=sc.nextLine();
                
                int start=0;
                int end=str.length()-1;
                boolean ispal=true;
                
                while(start<end){
                    if(str.charAt(start)!=str.charAt(end)){
                        ispal=false;
                        break;
                    }
                    
                    start++;
                    end--;
                }
                if(!ispal){
                    System.out.println("not palindrome");
                }
                
                if(ispal)
                    System.out.println(" pal");
            }
		}
		
		

	}
