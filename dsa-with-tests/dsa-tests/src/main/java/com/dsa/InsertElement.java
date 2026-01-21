package com.dsa;
public class InsertElement {

    // PURE LOGIC — test this with JUnit
    public static int insertElement(int[] arr, int size, int pos, int x) {

        if (arr == null || size == arr.length || pos < 1 || pos > size + 1) {
            return size;
        }

        int idx = pos - 1;

        for (int i = size - 1; i >= idx; i--) {//most important we are ist shifting elements after index to right side to make space for new element
            arr[i + 1] = arr[i];
        }

        arr[idx] = x;//inserting the value at index which we freed by shifting
        return size + 1;// returning the size after shifting
    }

    // ENTRY POINT — manual testing only
    public static void main(String[] args) {

        int[] arr = new int[6];//creates array with capacity 6
        int size = 5;//this means currently the array has 5 elements

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 4;
        arr[4] = 6;

        size = insertElement(arr, size, 3, 8);

        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
