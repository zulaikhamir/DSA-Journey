package com.dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SearchInArrayTest {

    @Test
    void testElementPresentInMiddle() {
        int[] arr = {1, 4, 3, 5};
        int result = SearchInArray.search(arr, 3);
        assertEquals(2, result);
    }

    @Test
    void testElementPresentAtBeginning() {
        int[] arr = {3, 4, 5, 6};
        int result = SearchInArray.search(arr, 3);
        assertEquals(0, result);
    }

    @Test
    void testElementPresentAtEnd() {
        int[] arr = {1, 2, 3, 4};
        int result = SearchInArray.search(arr, 4);
        assertEquals(3, result);
    }

    @Test
    void testElementNotPresent() {
        int[] arr = {1, 2, 4, 5};
        int result = SearchInArray.search(arr, 3);
        assertEquals(-1, result);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {2, 3, 3, 3, 5};
        int result = SearchInArray.search(arr, 3);
        assertEquals(1, result); // first occurrence
    }

    @Test
    void testSingleElementArrayFound() {
        int[] arr = {7};
        int result = SearchInArray.search(arr, 7);
        assertEquals(0, result);
    }

    @Test
    void testSingleElementArrayNotFound() {
        int[] arr = {7};
        int result = SearchInArray.search(arr, 3);
        assertEquals(-1, result);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int result = SearchInArray.search(arr, 3);
        assertEquals(-1, result);
    }

    @Test
    void testNullArray() {
        int[] arr = null;
        int result = SearchInArray.search(arr, 3);
        assertEquals(-1, result);
    }
}
