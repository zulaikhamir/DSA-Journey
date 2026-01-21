package com.dsa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SumOfEvenElementsTest {

    @Test
    void testSumOfEvenElements() {
        int[] arr = {15, 20, 35, 60, 105};
        int result = SumOfEvenElements.sumOfEvenElements(arr);
        assertEquals(80, result);
    }
    @Test
    void testSumOfEvenElementsWithZero() {
        int[] arr = {0, 0, 0, 0, 0};
        int result = SumOfEvenElements.sumOfEvenElements(arr);
        assertEquals(0, result);
    }
    @Test
    void testSumOfEvenElementsWithNegative() {
        int[] arr = {-1, -2, -3, -4, -5};
        int result = SumOfEvenElements.sumOfEvenElements(arr);
        assertEquals(-6, result);
    }
}
