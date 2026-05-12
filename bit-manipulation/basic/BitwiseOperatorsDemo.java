public class BitwiseOperatorsDemo {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int r = -4;
        int s = 5;

        System.out.println("bitwise AND " + (x & y));// bitwise AND - compares each bit of the first operand to the corresponding bit of the second operand, and if both bits are 1, the corresponding result bit is set to 1, otherwise, it is set to 0
        System.out.println("bitwise OR " + (x | y));// bitwise OR - compares each bit of the first operand to the corresponding bit of the second operand, and if either bit is 1, the corresponding result bit is set to 1, otherwise, it is set to 0
        System.out.println("bitwise XOR " + (x ^ y));// exclusive OR - if both bits are different, then the result is 1, otherwise, the result is 0
        System.out.println("bitwise NOT " + (~s));// bitwise NOT - inverts the bits of the number, changing 0s to 1s and 1s to 0s
        System.out.println("left shift " + (x << y));// left shift - shifts the bits of the number to the left by a specified number of positions, filling the rightmost bits with zeros
        System.out.println("unsigned right shift " + (y >>> 2));// unsigned right shift - shifts the bits of the number to the right by a specified number of positions, filling the leftmost bits with zeros
        System.out.println("signed right shift " + (r >> 1));// signed right shift - shifts the bits of the number to the right by a specified number of positions, filling the leftmost bits with the sign bit
    }
}
