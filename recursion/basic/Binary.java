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

