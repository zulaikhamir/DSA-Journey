class Solution {

    public String toBinary(int n) {

        // base case
        if (n == 0) {
            return "0";
        }

        // recursive relation
        return toBinary(n/2) + (n%2);

    }
}
//according to this code the output of toBinary(8) will be 01000 becuase on base case we are returning 0 and that 0 gets appennded to the result
//and if i do base case return "" then the output will be 1000 which is correct binary representation of 8
//and i will handle the case when n is 0 separately in main function
class Solution {

    public String toBinary(int n) {

        // base case
        if (n == 0) {
            return "";
        }

        // recursive relation
        return toBinary(n/2) + (n%2);

    }

    public static void main(String[] args){
        int n = 8;
        if(n == 0){
            System.out.println("0");
        } else {
            System.out.println(new Solution().toBinary(n));
        }
    }
}
