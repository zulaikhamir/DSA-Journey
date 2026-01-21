package com.dsa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ArraySumTest {

    @Test
    void testArraySum() {
        int[] arr = {10, 20, 30, 60, 100};
        int result = ArraySum.calculateSum(arr);
        assertEquals(220, result);
    }

    @Test
    void testArraySumWithZero() {
        int[] arr = {0, 0, 0, 0, 0};
        int result = ArraySum.calculateSum(arr);
        assertEquals(0, result);
    }
    @Test
    void testArraySumWithNegative() {
        int[] arr = {-1, -2, -3, -4, -5};
        int result = ArraySum.calculateSum(arr);
        assertEquals(-15, result);
    }
}
