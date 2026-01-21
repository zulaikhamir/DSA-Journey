package com.dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SecondLargestInArrayTest {

    @Test
    void testNormalArray() {
        int[] arr = {2, 5, 7, 9, 45, 6, 7};
        int result = SecondLargestInArray.secondLargest(arr);
        assertEquals(9, result);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {10, 20, 20, 30};
        int result = SecondLargestInArray.secondLargest(arr);
        assertEquals(20, result);
    }

    @Test
    void testAllElementsSame() {
        int[] arr = {5, 5, 5, 5};
        int result = SecondLargestInArray.secondLargest(arr);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-1, -5, -3, -10};
        int result = SecondLargestInArray.secondLargest(arr);
        assertEquals(-3, result);
    }

    @Test
    void testTwoElementArray() {
        int[] arr = {4, 9};
        int result = SecondLargestInArray.secondLargest(arr);
        assertEquals(4, result);
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {7};
        int result = SecondLargestInArray.secondLargest(arr);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int result = SecondLargestInArray.secondLargest(arr);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    void testNullArray() {
        int[] arr = null;
        int result = SecondLargestInArray.secondLargest(arr);
        assertEquals(Integer.MIN_VALUE, result);
    }
}
