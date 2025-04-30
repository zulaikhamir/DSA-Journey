
public class twostackarray {

    static int n = 10;
    static int[] arr = new int[n];
    static int top1 = -1;
    static int top2 = n;

    public static void main(String[] args) {
        int one = 10;
        int two = 20;

        push1(one);
        push2(two);

        System.out.println("Top of Stack 1: " + arr[top1]);
        System.out.println("Top of Stack 2: " + arr[top2]);

        int p1 = pop1();
        int p2 = pop2();
        System.out.println("pop " + p1);
        System.out.println("pop " + p2);
    }

    static void push1(int val) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = val;
        } else {
            System.out.println("Stack Overflow in Stack 1");
        }
    }

    static void push2(int val) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = val;
        } else {
            System.out.println("Stack Overflow in Stack 2");
        }
    }

    static int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;

        } else {
            System.exit(1);
            return -1;
        }
    }

    static int pop2() {
        if (top2 < n) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.exit(1);//In Java, exit is a method from the System class, so you should call it as:
            return -1;

        }

    }

}
// 🚨 System.exit(-1) specifically:
// Stops the program immediately.

// Returns -1 to the OS, signaling an abnormal/error termination.

// Often used in error handling when continuing execution is meaningless (e.g., fatal error, corrupt data).
