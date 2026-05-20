//Leetcode
//naive solution
//time is O(n^2) because we have to compare each element with every other element in the array
//space is O(1) because we are not using any extra space to sort the array
public class BubbleSort{
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){//why arr.length-1-i because after each pass the largest element is at the end of the array so we can ignore it in the next pass
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
            }
        }
    }
}
}
//optimized solution
//we can use the optimised solution when the array is already sorted or nearly sorted, in that case we can stop the algorithm if no swapping is done in a pass
//time complexity is O(n) in the best case when the array is already sorted and O(n^2) in the worst case when the array is sorted in reverse order
//space complexity is O(1) because we are not using any extra space to sort the array
public class BubbleSort{
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
             boolean swapped=false;//to check if any swapping is done in a pass
             for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;//if swapping is done then set swapped to true
                }
             }
             if(!swapped){//means if swapped is false then no swapping is done in a pass then the array is already sorted
                break;//if no swapping is done in a pass then the array is already sorted
             }

         }
    }
}
