class Solution {

    public int toBinary(int n) {

        if(n == 0)
            return 0;

        return toBinary(n/2) * 10 + (n % 2);

    }
}

// public class DecimalToBinary {

//     static void toBinary(int n){
//         if(n == 0)
//             return;

//         toBinary(n/2);
//         System.out.print(n % 2);
//     }

//     public static void main(String[] args) {

//         int n = 7;

//         if(n == 0)
//             System.out.print(0);
//         else
//             toBinary(n);
//     }
// }
