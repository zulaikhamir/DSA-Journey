public class sumofnatural{

static int  sum(int n){
	if(n==0)
	return 0;
	else
	return n + sum(n-1);

}



public static void main(String[] args) {
	int n=7;
	System.out.println(sum(n));
}


}