package com.dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LargestElementTest {

    @Test
    void testNormalArray() {
        int[] arr = {1, 2, 3, 5, 6, 8, 9, 3, 4, 184};
        int result = LargestElement.findLargest(arr);
        assertEquals(184, result);
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {7};
        int result = LargestElement.findLargest(arr);
        assertEquals(7, result);
    }

    @Test
    void testAllNegativeNumbers() {
        int[] arr = {-10, -3, -50, -1};
        int result = LargestElement.findLargest(arr);
        assertEquals(-1, result);
    }

    @Test
    void testLargestAtBeginning() {
        int[] arr = {100, 20, 30, 40};
        int result = LargestElement.findLargest(arr);
        assertEquals(100, result);
    }

    @Test
    void testLargestAtEnd() {
        int[] arr = {1, 2, 3, 4, 99};
        int result = LargestElement.findLargest(arr);
        assertEquals(99, result);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int result = LargestElement.findLargest(arr);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    void testNullArray() {
        int[] arr = null;
        int result = LargestElement.findLargest(arr);
        assertEquals(Integer.MIN_VALUE, result);
    }
}
