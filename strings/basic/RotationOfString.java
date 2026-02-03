
public class RotationOfString {

    public static void main(String[] args) {
        String s1 = "heyhellot";
        String s2 = "hellotyeh";

        if (s1.length() != s2.length()) {
            System.out.println("no rotaion ");

        } else {
            if ((s1 + s1).contains(s2)) {//indexOf
                System.out.println("present");
            } else {
                System.out.println("noooooo");
            }

        }

    }
}
