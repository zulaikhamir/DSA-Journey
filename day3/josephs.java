
public class josephs {

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int res = cut(n, k);
        System.out.println(res);
        //if the index starts from one or the circle starts fro one
        int res2 = mycut(n, k);
        System.out.println(res2);

    }

    static int cut(int n, int k) {
        if (n == 1) {
            return 0;
            // Explanation:
// The recursion builds up from the base case (1 person left -> position 0)
// Then, with each returning call, it shifts the survivor's position by k 
// and takes modulo n to ensure it wraps around in a circular manner
// Eventually, when all recursive calls complete, we get the final safe position
        } else {
            return (cut(n - 1, k) + k) % n;
        }

    }//if the index starts from one or the circle starts fro one

    static int mycut(int n, int k) {
        return cut(n, k) + 1;
    }

}
