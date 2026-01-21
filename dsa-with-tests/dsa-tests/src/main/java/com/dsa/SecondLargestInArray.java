package com.dsa;
public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 45, 6, 7};
        int result = secondLargest(arr);
        System.out.println("second largest is: " + result);
    }

    // returns second largest VALUE
    static int secondLargest(int[] arr) {

        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int largestValue = largest(arr);
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largestValue && arr[i] > res) {
                res = arr[i];
            }
        }

        // if no valid second largest found
        if (res == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return res;
    }

    // returns largest VALUE
    static int largest(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
