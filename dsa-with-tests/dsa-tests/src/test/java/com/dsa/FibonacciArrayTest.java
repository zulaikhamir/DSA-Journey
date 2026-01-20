package com.dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FibonacciArrayTest {

    // 1️⃣ Boundary: n = 0
    @Test
    void generate_with_0_returns_empty_array() {
        int[] result = FibonacciArray.generate(0);

        assertEquals(0, result.length);
    }

    // 2️⃣ Smallest valid input: n = 1
    @Test
    void generate_with_1_returns_array_with_0() {
        int[] expected = {0};
        int[] actual = FibonacciArray.generate(1);

        assertArrayEquals(expected, actual);
    }

    // 3️⃣ Boundary: n = 2
    @Test
    void generate_with_2_returns_0_and_1() {
        int[] expected = {0, 1};
        int[] actual = FibonacciArray.generate(2);

        assertArrayEquals(expected, actual);
    }

    // 4️⃣ Normal case
    @Test
    void generate_with_5_returns_first_five_fibonacci_numbers() {
        int[] expected = {0, 1, 1, 2, 3};
        int[] actual = FibonacciArray.generate(5);

        assertArrayEquals(expected, actual);
    }

    // 5️⃣ Larger input (loop confidence)
    @Test
    void generate_with_10_returns_correct_fibonacci_sequence() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] actual = FibonacciArray.generate(10);

        assertArrayEquals(expected, actual);
    }

    // 6️⃣ Invalid input: negative n
    @Test
    void generate_with_negative_n_returns_empty_array() {
        int[] result = FibonacciArray.generate(-4);

        assertEquals(0, result.length);
    }
}
