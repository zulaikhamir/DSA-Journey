package com.dsa;
public class LeftRotateBy2 {

    // PURE LOGIC — test this with JUnit
    public static void LeftRotateBy2(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        int temp1 = arr[0];
        int temp2= arr[1];

        for (int i = 2; i < n; i++) {
            arr[i - 2] = arr[i];
        }

        arr[n - 2] = temp1;
        arr[n-1]=temp2;
    }

    // ENTRY POINT — manual testing only
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        LeftRotateBy2(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
