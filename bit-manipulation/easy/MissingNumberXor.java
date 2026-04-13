
public class MissingNumberXor {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};

        int no = missingnoo(arr);
        System.out.println("missing no is: " + no);
    }

    static int missingnoo(int[] arr) {
        int xor1 = 0;//xor of all elements from 1 to n+1
        int xor2 = 0;//xor of array elements

        int n = arr.length;

        for (int i = 1; i <= n + 1; i++) {
            xor1 = xor1 ^ i;     //this is expected xor thats xor of all elements from 1 to n+1
        }

        for (int num : arr) {
            xor2 = xor2 ^ num;//expected xor
        }

        return xor1 ^ xor2;//we xor the answer of xor 1 and xor 2 and that gives us the missing no because the nos preent in original on xoring with array will cancel out the ones in original only the one not present in array will no get cancelled out

    }

}


//leetcode soln
class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0;
        int xor2=0;
        for(int i=0;i<=nums.length;i++){
            xor1=xor1^i;
        }

        for(int num:nums){
            xor2=xor2^num;
        }
        return xor1^xor2;
    }
}

