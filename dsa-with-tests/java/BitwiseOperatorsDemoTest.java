import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitwiseOperatorsDemoTest {

    @Test
    public void testAndOperation() {
        assertEquals(0, BitwiseOperatorsDemo.andOperation(2, 3));
    }

    @Test
    public void testOrOperation() {
        assertEquals(3, BitwiseOperatorsDemo.orOperation(2, 3));
    }

    @Test
    public void testXorOperation() {
        assertEquals(1, BitwiseOperatorsDemo.xorOperation(2, 3));
    }

    @Test
    public void testNotOperation() {
        assertEquals(-3, BitwiseOperatorsDemo.notOperation(2));
    }

    @Test
    public void testLeftShiftOperation() {
        assertEquals(8, BitwiseOperatorsDemo.leftShiftOperation(2, 2));
    }

    @Test
    public void testRightShiftOperation() {
        assertEquals(0, BitwiseOperatorsDemo.rightShiftOperation(2, 2));
    }
}