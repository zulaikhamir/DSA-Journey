package com.dsa;
public class SumOfEvenElements {

    // PURE LOGIC — this is what JUnit will test
    public static int sumOfEvenElements(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        return sum;
    }

    // ENTRY POINT — kept for manual run
    public static void main(String[] args) {
        int[] arr = {15, 20, 35, 60, 105};
        int result = sumOfEvenElements(arr);

        System.out.println("Sum of even elements: " + result);
    }
}
