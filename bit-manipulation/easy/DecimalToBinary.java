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


class Solution {
    static String decToBinary(int n) {

        if (n == 0) return "0";

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }

        return sb.reverse().toString();
    }
}


// class Solution {
//     static String decToBinary(int n) {

//         if (n == 0) return "0";

//         if (n == 1) return "1";

//         return decToBinary(n / 2) + (n % 2);
//     }
// }
