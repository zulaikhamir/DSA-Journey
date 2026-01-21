package com.dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReverseArrayTest {

    @Test
    void testNormalArray() {
        int[] arr = {1, 6, 5, 7, 3, 8, 9, 0};

        ReverseArray.reverse(arr);

        assertArrayEquals(
            new int[]{0, 9, 8, 3, 7, 5, 6, 1},
            arr
        );
    }

    @Test
    void testEvenLengthArray() {
        int[] arr = {1, 2, 3, 4};

        ReverseArray.reverse(arr);

        assertArrayEquals(
            new int[]{4, 3, 2, 1},
            arr
        );
    }

    @Test
    void testOddLengthArray() {
        int[] arr = {1, 2, 3, 4, 5};

        ReverseArray.reverse(arr);

        assertArrayEquals(
            new int[]{5, 4, 3, 2, 1},
            arr
        );
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {7};

        ReverseArray.reverse(arr);

        assertArrayEquals(
            new int[]{7},
            arr
        );
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};

        ReverseArray.reverse(arr);

        assertArrayEquals(
            new int[]{},
            arr
        );
    }

    @Test
    void testNullArray() {
        int[] arr = null;

        // should not throw
        ReverseArray.reverse(arr);

        assertNull(arr);
    }
}
