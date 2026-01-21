package com.dsa;
public class LargestElement {

    // PURE LOGIC — test this with JUnit
    public static int findLargest(int[] arr) {

        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // ENTRY POINT — manual testing only
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 8, 9, 3, 4, 184};
        System.out.println("max is: " + findLargest(arr));
    }
}
