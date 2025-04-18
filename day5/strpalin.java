public class strpalin{

static boolean ispalin(String str,int start,int end){
	if(start>=end)
	return true;
	return (str.charAt(start)==str.charAt(end) && ispalin(str,start+1,end-1));
}
public static void main(String[] args) {
	String str="a";
	System.out.println(ispalin(str, 0,str.length()-1));
}

}