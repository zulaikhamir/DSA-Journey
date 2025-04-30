
import java.util.Stack;

public class balancedparan {

    public static void main(String[] args) {
        String str = "({{[]}})";
        String str2 = "{";
        String str3 = "{[}";

        System.out.println(str + " is balanced: " + isBalanced(str));
        System.out.println(str2 + " is balanced: " + isBalanced(str2));
        System.out.println(str3 + " is balanced: " + isBalanced(str3));
    }

    static boolean isBalanced(String str) {
        Stack<Character> s = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                s.push(current);
            } else {
                if (s.empty()) {
                    return false;
                } else {
                    if (!matching(s.peek(), current)) {
                        return false;
                    } else {
                        s.pop();
                    }
                }
            }
        }

        return s.empty();
    }

    static boolean matching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
}
