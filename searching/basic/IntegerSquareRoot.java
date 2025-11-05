
// public class IntegerSquareRoot {//naive
//     public static void main(String[] args) {
//         int x = 25;
//         int i = 1;
//         while (i * i <= x) {
//             i++;
//         }
//         System.out.println("sqrt is :" + (i - 1));
//     }
// }
//using binary search
public class IntegerSquareRoot {

    public static void main(String[] args) {
        int x = 25; // Number whose square root we want to find

        int low = 1;          // Starting point of binary search
        int high = x;         // Ending point of binary search
        int res = -1;         //Using -1 makes it clear:

        //It means “no valid result yet.” and if we initialize it with 0 or one it means that we are ourselves assuming sqrt is 0 or 1 which may be not,
        // Binary search loop to narrow down possible square root
        while (low <= high) {
            int mid = (low + high) / 2;   // Find middle value between low and high
            int msq = mid * mid;          // Calculate square of mid

            if (msq == x) {
                // If square of mid is exactly equal to x, we found the exact square root
                res = mid;
                break;
            } else if (msq < x) {
                // If mid squared is less than x:
                //  - mid could be our answer (floor value)
                //  - but maybe there's a larger mid with square still <= x
                res = mid;        // Update result to current mid (possible answer)
                low = mid + 1;    // Move to right half (look for larger possible value)
            } else {
                // If mid squared is greater than x:
                //  - mid can't be the answer
                //  - move to the left half to check smaller values
                high = mid - 1;
            }
        }

        // After loop ends, res holds the floor of sqrt(x)
        System.out.println("Square root is: " + res);
    }
}
