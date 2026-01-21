package com.dsa;
public class FindElement {

    // PURE LOGIC — test this with JUnit
    public static int findElement(int[] arr, int k) {

        if (arr == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i; // stop immediately
            }
        }

        return -1; // not found
    }

    // ENTRY POINT — manual testing only
    public static void main(String[] args) {
        int[] arr = {};
        int k = 60;

        int index = findElement(arr, k);

        if (index != -1) {
            System.out.println("found at " + index);
        } else {
            System.out.println("not found");
        }
    }
}
