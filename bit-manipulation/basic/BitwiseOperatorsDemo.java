public class BitwiseOperatorsDemo {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int r = -4;
        int s = 5;

        System.out.println("bitwise AND " + (x & y));
        System.out.println("bitwise OR " + (x | y));
        System.out.println("bitwise XOR " + (x ^ y));
        System.out.println("bitwise NOT " + (~s));
        System.out.println("left shift " + (x << y));
        System.out.println("unsigned right shift " + (y >>> 2));
        System.out.println("signed right shift " + (r >> 1));
    }
}
