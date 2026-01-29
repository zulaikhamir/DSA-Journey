package com.dsa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

    @Test
    void removesDuplicatesFromSortedArray() {
        int[] arr = {10, 10, 20, 30, 50, 50};

        int newLength = RemoveDuplicates.remove(arr);

        assertEquals(4, newLength);
        assertArrayEquals(
            new int[]{10, 20, 30, 50},
            firstN(arr, newLength)
        );
    }

    @Test
    void arrayWithNoDuplicatesRemainsSame() {
        int[] arr = {1, 2, 3, 4};

        int newLength = RemoveDuplicates.remove(arr);

        assertEquals(4, newLength);
        assertArrayEquals(
            new int[]{1, 2, 3, 4},
            firstN(arr, newLength)
        );
    }

    @Test
    void arrayWithAllDuplicatesReturnsSingleElement() {
        int[] arr = {5, 5, 5, 5};

        int newLength = RemoveDuplicates.remove(arr);

        assertEquals(1, newLength);
        assertArrayEquals(
            new int[]{5},
            firstN(arr, newLength)
        );
    }

    @Test
    void emptyArrayReturnsZero() {
        int[] arr = {};

        int newLength = RemoveDuplicates.remove(arr);

        assertEquals(0, newLength);
    }

    // helper: only checks the valid prefix
    private int[] firstN(int[] arr, int n) {
        int[] result = new int[n];
        System.arraycopy(arr, 0, result, 0, n);
        return result;
    }
}
