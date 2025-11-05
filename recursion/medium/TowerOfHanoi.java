public class TowerOfHanoi{


	static void tower(int n, char A,char B,char C){
		if(n==1){
			System.out.println("move disc "+n+ " from " +A+" to "+B);
			return;
		}
		//our mission is to ove from a to b
		tower(n-1,A,C,B);//move a to c using b as aux
		System.out.println("move disc "+n+ " from " +A+" to "+B);
		tower(n-1,C,B,A);//mov c to b using a as aux
	}
	public static void main(String[] args) {

		int n=3;
		char a='A';
		char b='B';
		char c='C';
		tower(n,a,b,c);
	}
}