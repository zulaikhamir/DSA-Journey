package com.dsa;
public class SearchInArray {

    // PURE LOGIC — test this with JUnit
    public static int search(int[] arr, int k) {

        if (arr == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i; // found
            }
        }

        return -1; // not found
    }

    // ENTRY POINT — manual testing only
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1, 4, 3, 5};

        int index = search(arr, k);

        if (index != -1) {
            System.out.println("found at " + index);
        } else {
            System.out.println("not found");
        }
    }
}
