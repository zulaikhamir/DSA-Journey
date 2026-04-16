class NtoOne {

    public static void printNtoOne(int n){

        if(n == 0){
            return;
        }

        System.out.print(n + " ");

        printNtoOne(n-1);
    }

    public static void main(String[] args){
        printNtoOne(5);
    }
}
