package com.dsa;
public class ArraySum {

    // Logic method (testable)
    public static int calculateSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // Runner method (not tested)
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 60, 100};
        int result = calculateSum(arr);

        System.out.println("The sum of elements of array is: " + result);
    }
}
