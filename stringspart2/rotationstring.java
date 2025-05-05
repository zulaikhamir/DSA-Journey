
public class rotationstring {

    public static void main(String[] args) {
        String s1 = "heyhellot";
        String s2 = "hellotyeh";

        if (s1.length() != s2.length()) {
            System.out.println("no rotaion ");

        } else {
            if ((s1 + s1).indexOf(s2) >= 0) {
                System.out.println("present");
            } else {
                System.out.println("noooooo");
            }

        }

    }
}
