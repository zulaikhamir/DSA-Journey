package com.dsa;
public class CheckSortedArray {

    // PURE LOGIC — test this with JUnit
    public static boolean isSorted(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    // ENTRY POINT — optional, for manual checking only
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 5, 6};

        if (isSorted(arr)) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }
}
