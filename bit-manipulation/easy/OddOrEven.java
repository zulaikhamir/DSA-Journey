class odd{
	public static void main(String[] args) {
		int res=0;
		int arr[]={1,1,2,2,2,3,3};
		for(int i=0;i<arr.length;i++){
			res=res^arr[i];

		}
		System.out.println(res);

	}
}

// class odd{
//     public static void main(String[] args) {

//         int arr[]={1,2,3,4,1,2,3,4,5,5,5,5,5};

//         // tracks which elements are already counted
//         boolean[] printed = new boolean[arr.length];

//         // pick each element one by one
//         for(int i=0;i<arr.length;i++){

//             // skip element if already counted earlier
//             if(printed[i]) continue;

//             int count=0;

//             // count frequency of current element
//             for(int j=0;j<arr.length;j++){

//                 // if same element found, increase count
//                 // mark index so we don't count again
//                 if(arr[i]==arr[j]){
//                     count++;
//                     printed[j]=true;
//                 }

//             }

//             // print element if occurrence count is odd
//             if(count%2!=0){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }


//print in descending order
import java.util.*;

class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {

        int xor = 0;

        // Step 1: XOR of all elements = x ^ y
        for(int num : arr){
            xor ^= num;
        }

        // Step 2: find rightmost set bit (where x and y differ)
        int setBit = xor & -xor;

        int num1 = 0;
        int num2 = 0;

        // Step 3: divide numbers into two groups
        for(int num : arr){

            // bit present in this group
            if((num & setBit) != 0){
                num1 ^= num;
            }

            // bit not present in this group
            else{
                num2 ^= num;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        // GFG expects descending order
        if(num1 > num2){
            list.add(num1);
            list.add(num2);
        }else{
            list.add(num2);
            list.add(num1);
        }

        return list;
    }
}
