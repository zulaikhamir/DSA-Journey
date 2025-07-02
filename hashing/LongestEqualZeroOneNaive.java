
public class LongestEqualZeroOneNaive {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 1};

        int maxLength = 0;

        // Outer loop for starting index
        for (int i = 0; i < arr.length; i++) {
            int countZero = 0;
            int countOne = 0;

            // Inner loop for ending index
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    countZero++; 
                }else {
                    countOne++;
                }

                // If equal number of 0s and 1s
                if (countZero == countOne) {
                    int length = j - i + 1;
                    if (length > maxLength) {
                        maxLength = length;
                    }
                }
            }
        }

        System.out.println("Length of longest subarray with equal number of 0s and 1s is: " + maxLength);
    }
}
