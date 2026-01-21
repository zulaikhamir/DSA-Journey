package com.dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InsertElementTest {

    @Test
    void testInsertInMiddle() {
        int[] arr = new int[6];
        int size = 5;

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 4;
        arr[4] = 6;

        int result = InsertElement.insertElement(arr, size, 3, 8);

        assertEquals(6, result);
        assertEquals(8, arr[2]);
    }

    @Test
    void testInsertAtBeginning() {
        int[] arr = new int[5];
        int size = 4;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int result = InsertElement.insertElement(arr, size, 1, 5);

        assertEquals(5, result);
        assertEquals(5, arr[0]);
    }

    @Test
    void testInsertAtEnd() {
        int[] arr = new int[5];
        int size = 4;

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        int result = InsertElement.insertElement(arr, size, 5, 9);

        assertEquals(5, result);
        assertEquals(9, arr[4]);
    }

    @Test
    void testInsertWhenArrayIsFull() {
        int[] arr = {1, 2, 3};
        int size = 3;

        int result = InsertElement.insertElement(arr, size, 2, 99);

        assertEquals(3, result); // size unchanged
    }

    @Test
    void testInsertInvalidPosition() {
        int[] arr = new int[5];
        int size = 3;

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int result = InsertElement.insertElement(arr, size, 10, 99);

        assertEquals(3, result);
    }
}
