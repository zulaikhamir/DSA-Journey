package com.dsa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FibonacciSequenceTest {
    @Test
    void testFibonacciSequence() {
        assertEquals(13, FibonacciSequence.fibonacci(7));
    }
    @Test
    void testFibonacciSequenceWithZero() {
        assertEquals(0, FibonacciSequence.fibonacci(0));
    }
    @Test
    void testFibonacciSequenceWithOne() {
        assertEquals(1, FibonacciSequence.fibonacci(1));
    }
    @Test
    void testFibonacciSequenceWithNegative() {
        assertEquals(0, FibonacciSequence.fibonacci(-1));
    }
}
