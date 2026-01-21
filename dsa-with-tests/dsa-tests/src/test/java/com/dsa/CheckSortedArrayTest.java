package com.dsa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CheckSortedArrayTest {
    @Test
    void testCheckSortedArray() {
        int[] arr = {1, 2, 3, 8, 5, 6};
        boolean result = CheckSortedArray.isSorted(arr);
        assertFalse(result);
    }
    @Test
    void testCheckSortedArrayWithZero() {
        int[] arr = {0, 0, 0, 0, 0};
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testCheckSortedArrayWithNegative() {
        int[] arr = {-1, -2, -3, -4, -5};
        boolean result = CheckSortedArray.isSorted(arr);
        assertFalse(result);
    }
    @Test
    void testCheckSortedArrayWithNull() {
        int[] arr = null;
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testCheckSortedArrayWithOneElement() {
        int[] arr = {1};
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testCheckSortedArrayWithTwoElements() {
        int[] arr = {1, 2};
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testCheckSortedArrayWithThreeElements() {
        int[] arr = {1, 2, 3};
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testCheckSortedArrayWithFourElements() {
        int[] arr = {1, 2, 3, 4};
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testCheckSortedArrayWithFiveElements() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testCheckSortedArrayWithSixElements() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testCheckSortedArrayWithSevenElements() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testCheckSortedArrayWithEightElements() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testCheckSortedArrayWithNineElements() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean result = CheckSortedArray.isSorted(arr);
        assertTrue(result);
    }
}
