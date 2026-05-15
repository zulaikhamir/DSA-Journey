//the problem is to move n discs from a to b using c as auxilary
//the rules are only one disc can be moved at a time and each move consists of taking the upper disc from one of the stacks and placing it on top of another stack or on an empty rod
//no disc may be placed on top of a smaller disc
//


public class TowerOfHanoi{


	static void tower(int n, char A,char B,char C){//means move n discs from A to B using C as auxilary
		if(n==1){
			System.out.println("move disc "+n+ " from " +A+" to "+B);
			return;
		}
		//our mission is to move from a to b
		tower(n-1,A,C,B);//move a to c using b as aux
		System.out.println("move disc "+n+ " from " +A+" to "+B);//move the largest disc from a to b
		tower(n-1,C,B,A);//move c to b using a as aux
	}
	public static void main(String[] args) {

		int n=3;
		char a='A';
		char b='B';
		char c='C';
		tower(n,a,b,c);
	}
}
