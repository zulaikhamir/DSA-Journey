package com.dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LeftRotateBy2Test {

    @Test
    void testNormalArray() {
        int[] arr = {1, 2, 3, 4, 5};

        LeftRotateBy2.LeftRotateBy2(arr);

        assertArrayEquals(
            new int[]{3, 4, 5, 1, 2},
            arr
        );
    }

    @Test
    void testEvenLengthArray() {
        int[] arr = {10, 20, 30, 40};

        LeftRotateBy2.LeftRotateBy2(arr);

        assertArrayEquals(
            new int[]{30, 40, 10, 20},
            arr
        );
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {1, 1, 2, 2, 3};

        LeftRotateBy2.LeftRotateBy2(arr);

        assertArrayEquals(
            new int[]{2, 2, 3, 1, 1},
            arr
        );
    }

    @Test
    void testArrayOfSizeTwo() {
        int[] arr = {7, 9};

        LeftRotateBy2.LeftRotateBy2(arr);

        assertArrayEquals(
            new int[]{7, 9},
            arr
        );
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {5};

        LeftRotateBy2.LeftRotateBy2(arr);

        assertArrayEquals(
            new int[]{5},
            arr
        );
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};

        LeftRotateBy2.LeftRotateBy2(arr);

        assertArrayEquals(
            new int[]{},
            arr
        );
    }

    @Test
    void testNullArray() {
        int[] arr = null;

        // should not throw
        LeftRotateBy2.LeftRotateBy2(arr);

        assertNull(arr);
    }
}
