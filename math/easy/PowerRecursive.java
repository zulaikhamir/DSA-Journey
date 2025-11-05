
// public class PowerRecursive {
//     public static void main(String[] args) {
//         int x = 2;
//         int n = 3;
//         int res = 1;
//         for (int i = 0; i < n; i++) {
//             res = res * x;
//         }
//         System.out.println(res);
//     }
// }
public class PowerRecursive {

    public static void main(String[] args) {

        int x = 2;
        int n = 3;
        int res = power(x, n);
        System.out.println(+res);

    }

    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = power(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }
}
// formulla i am using to solve this
// power(x, n) = 
//     if (n == 0) → 1
//     else if (n % 2 == 0) → power(x, n/2) * power(x, n/2)
//     else               → x * power(x, n/2) * power(x, n/2)

