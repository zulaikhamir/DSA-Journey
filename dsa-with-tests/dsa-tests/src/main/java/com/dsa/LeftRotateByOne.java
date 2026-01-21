package com.dsa;
public class LeftRotateByOne {

    // PURE LOGIC — test this with JUnit
    public static void leftRotateByOne(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
    }

    // ENTRY POINT — manual testing only
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        leftRotateByOne(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
