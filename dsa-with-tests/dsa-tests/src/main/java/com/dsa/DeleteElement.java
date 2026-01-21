package com.dsa;
public class DeleteElement {

    // PURE LOGIC — test this with JUnit
    public static int deleteElement(int[] arr, int n, int x) {

        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }

        if (i == n) {
            return n; // element not found, size unchanged
        }

        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        return n - 1; // new logical size
    }

    // ENTRY POINT — manual testing only
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        n = deleteElement(arr, n, 4);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
