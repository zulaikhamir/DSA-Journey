package com.dsa;
public class SecondLargestEfficient {

    // Returns index of second largest element, or -1 if not found
    static int secondLargestIndex(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = 0;
        int res = -1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }

        return res;
    }

    // Executable entry point
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 45, 6, 7};

        int index = secondLargestIndex(arr);

        if (index != -1) {
            System.out.println("Second largest value is: " + arr[index]);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
