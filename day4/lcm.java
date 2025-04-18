public class lcm{
static int lcmm(int a, int b){
	int res=Math.max(a,b);
while (true) {
	if(res%a==0 && res%b==0){
		return res;
	}
	else{
		res++; 
	}
}
}

	public static void main(String[] args) {
		int a=3;
		int b=7;
		System.out.println("lcm is: "+lcmm(a,b));
	}
}