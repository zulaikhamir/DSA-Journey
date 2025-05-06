
public class sqrt {//naive

    public static void main(String[] args) {
        int x = 25;
        int i = 1;
        while (i * i <= x) {
            i++;
        }
        System.out.println("sqrt is :" + (i - 1));
    }
}
