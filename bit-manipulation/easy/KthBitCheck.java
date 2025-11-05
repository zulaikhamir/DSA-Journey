public class KthBitCheck{
	public static void main(String[] args) {

		int x=13;
		int k=3;

		if((x>>(k-1)&1)!=0)//right shift we are taking the kth bit which is set to last position and then AND it with 1 
		System.out.println("set"	);
		else{
			System.out.println("not set");
		}

		if((x &(1<<(k-1)))!=0)//left shift we are making a no in which only the kth bit is set and then AND that with no to find if set or not
		System.out.println("set"	);
		else{
			System.out.println("not set");
		}
	}
}