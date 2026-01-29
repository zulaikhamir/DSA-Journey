package com.dsa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SecondLargestEfficientTest {

    @Test
    void normalCase() {
        int[] arr = {2, 5, 7, 9, 45, 6, 7};

        int index = SecondLargestEfficient.secondLargestIndex(arr);

        assertEquals(9, arr[index]);
    }

    @Test
    void arrayWithDuplicates() {
        int[] arr = {10, 10, 10};

        int index = SecondLargestEfficient.secondLargestIndex(arr);

        assertEquals(-1, index);
    }

    @Test
    void arrayWithTwoElements() {
        int[] arr = {5, 10};

        int index = SecondLargestEfficient.secondLargestIndex(arr);

        assertEquals(0, index);
    }

    @Test
    void arrayWithOneElement() {
        int[] arr = {5};

        int index = SecondLargestEfficient.secondLargestIndex(arr);

        assertEquals(-1, index);
    }

    @Test
    void negativeNumbers() {
        int[] arr = {-1, -2, -3};

        int index = SecondLargestEfficient.secondLargestIndex(arr);

        assertEquals(-2, arr[index]);
    }
}
