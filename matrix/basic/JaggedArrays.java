//A jagged array is a 2D array where each row can have a different number of elements.
//it is possible because in java , a 2D array is actually an array of arrays, and each of those arrays can have different lengths.
//and the memory for each row is allocated separately, so they can have different sizes.


public class JaggedArrays {

    public static void main(String[] args) {

        int[][] arr = new int[5][];//5 rows and each row can have different number of columns

        for (int i = 0; i < arr.length; i++) {

            // Each row has i + 1 elements 0th row has one element, 1st row has 2 elements, 2nd row has 3 elements and so on
            arr[i] = new int[i + 1];

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}

//output will be
//0
//11
//222
// 3333
// 44444