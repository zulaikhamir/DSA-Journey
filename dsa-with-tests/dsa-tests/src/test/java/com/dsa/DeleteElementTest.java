package com.dsa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class DeleteElementTest {
    @Test
    void testDeleteElement() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int result = DeleteElement.deleteElement(arr, n, 4);
        assertEquals(5, result);
    }
    @Test
    void testDeleteElementWithZero() {
        int[] arr = {0, 0, 0, 0, 0};
        int n = arr.length;
        int result = DeleteElement.deleteElement(arr, n, 0);
        assertEquals(4, result);
    }
    @Test
    void testDeleteElementWithNegative() {
        int[] arr = {-1, -2, -3, -4, -5};
        int n = arr.length;
        int result = DeleteElement.deleteElement(arr, n, -1);
        assertEquals(4, result);
    }
    @Test
    void testDeleteElementWithOneElement() {
        int[] arr = {1};
        int n = arr.length;
        int result = DeleteElement.deleteElement(arr, n, 1);
        assertEquals(0, result);
    }
    @Test
    void testDeleteElementWithTwoElements() {
        int[] arr = {1, 2};
        int n = arr.length;
        int result = DeleteElement.deleteElement(arr, n, 2);
        assertEquals(1, result);
    }
    @Test
    void testDeleteElementWithThreeElements() {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int result = DeleteElement.deleteElement(arr, n, 3);
        assertEquals(2, result);
    }
}
