class OnetoN {

    public static void printOnetoN(int n){

        if(n == 0){
            return;
        }

        printOnetoN(n-1);

        System.out.print(n + " ");
    }

    public static void main(String[] args){
        printOnetoN(5);
    }
}
