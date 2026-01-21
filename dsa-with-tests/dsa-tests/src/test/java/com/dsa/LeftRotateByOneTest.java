package com.dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LeftRotateByOneTest {

    @Test
    void testNormalArray() {
        int[] arr = {1, 2, 3, 4, 5};

        LeftRotateByOne.leftRotateByOne(arr);

        assertArrayEquals(
            new int[]{2, 3, 4, 5, 1},
            arr
        );
    }

    @Test
    void testEvenLengthArray() {
        int[] arr = {10, 20, 30, 40};

        LeftRotateByOne.leftRotateByOne(arr);

        assertArrayEquals(
            new int[]{20, 30, 40, 10},
            arr
        );
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {1, 1, 2, 2, 3};

        LeftRotateByOne.leftRotateByOne(arr);

        assertArrayEquals(
            new int[]{1, 2, 2, 3, 1},
            arr
        );
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {7};

        LeftRotateByOne.leftRotateByOne(arr);

        assertArrayEquals(
            new int[]{7},
            arr
        );
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};

        LeftRotateByOne.leftRotateByOne(arr);

        assertArrayEquals(
            new int[]{},
            arr
        );
    }

    @Test
    void testNullArray() {
        int[] arr = null;

        // should not throw
        LeftRotateByOne.leftRotateByOne(arr);

        assertNull(arr);
    }
}
