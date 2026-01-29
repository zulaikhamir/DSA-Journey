package com.dsa;
public class RemoveDuplicates {

    // Returns the number of unique elements
    static int remove(int[] arr) {
        if (arr.length == 0) return 0;

        int res = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    // Executable entry point
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 50, 50};

        int newLength = remove(arr);

        // Print only valid elements
        for (int i = 0; i < newLength; i++) {
            System.out.println(arr[i]);
        }
    }
}
