package com.dsa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class FindElementTest {
    @Test
    void testFindElement() {
        int[] arr = {10, 20, 30, 60, 100};
        int k = 60;
        int result = FindElement.findElement(arr, k);
        assertEquals(3, result);
    }
    @Test
    void testFindElementWithZero() {
        int[] arr = {0, 0, 0, 0, 0};
        int k = 0;
        int result = FindElement.findElement(arr, k);
        assertEquals(0, result);
    }
    @Test
    void testFindElementWithNegative() {
        int[] arr = {-1, -2, -3, -4, -5};
        int k = -1;
        int result = FindElement.findElement(arr, k);
        assertEquals(0, result);
    }
    @Test
    void testFindElementWithNull() {
        int[] arr = null;
        int k = 0;
        int result = FindElement.findElement(arr, k);
        assertEquals(-1, result);
    }
}
