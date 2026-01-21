package com.dsa;
public class ReverseArray {

    // PURE LOGIC — test this with JUnit
    public static void reverse(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    // ENTRY POINT — manual testing only
    public static void main(String[] args) {
        int[] arr = {1, 6, 5, 7, 3, 8, 9, 0};

        reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
