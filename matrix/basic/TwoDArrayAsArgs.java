//passing 2d array as an argument to a method in java
//in java its very clean
//an array is an object and when we pass an array to a method, we are actually passing the reference of that array to the method. So any changes made to the array inside the method will be reflected in the original array.
//2d array is an array of arrays, so when we pass a 2d array to a method, we are actually passing the reference of that 2d array to the method. So any changes made to the 2d array inside the method will be reflected in the original 2d array.
//below is the demo code of passing 2d array as an argument to a method in java

public class TwoDArrayAsArgs {

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {//gives us no of rows
            for (int j = 0; j < arr[i].length; j++) {//gives us no of columns in that row
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original 2D Array:");
        print2DArray(arr);
    }
}