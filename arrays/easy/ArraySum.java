public class ArraySum {
    public static void main(String[] args) {

    int sum=0;
    int n=5;
    int arr[]={10,20,30,60,100};
    // int arr[] = new int[5];
    // arr[0] = 10;
    // arr[1] = 20;
    // arr[2] = 30;
    // arr[3] = 40;
    // arr[4] = 50;
      
	   int i=0;
  for(i=0;i<n;i++){
    sum=sum+arr[i];
  }
        System.out.println("The sum of elements of array of size  " + n + "  is: " + sum);
    }
}