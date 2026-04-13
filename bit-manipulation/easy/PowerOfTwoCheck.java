class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n == 0){
            return false;
        }

        while(n != 1){
            if(n % 2 != 0){
                return false;
            }
            n = n / 2;
        }

        return true;
    }
}



//using efficient algo

public class  powerof2{
	public static void main(String[] args) {
		int n=32;
		System.out.println(ispower2(n));


}
static boolean  ispower2(int n){

	if(n==0){
		return false;
	}

	return (n&(n-1))==0;
	}
}
//if no  is pwer of 2 it has only one set bit
