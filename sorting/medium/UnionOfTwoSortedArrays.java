//Merege two sorted arrays and print the union of them
//Time Complexity: O(nlogn) where n is the total number of elements in both arrays
//Space Complexity: O(n) where n is the total number of elements in both arrays
//This is the brute force approach where we merge both arrays and sort them and then print the unique elements


class UnionOfTwoSortedArrays {
    public void union(int[] arr1, int[] arr2) {
     int[] union = new int[arr1.length + arr2.length];

     for(int i=0; i<arr1.length; i++) {

             union[k++] = arr1[i];

     }

 for (int j=0; j<arr2.length; j++) {

             union[arr1.length + j] = arr2[j];

     }

     Arrays.sort(union);

     for(int i=0; i<union.length; i++) {
         if(i==0 || union[i] != union[i-1]) {//to avoid duplicates
             System.out.print(union[i] + " ");
         }
     }
    }
}

//Optimized approach using two pointers
//Time Complexity: O(n) where n is the total number of elements in both arrays
//Space Complexity: O(n) where n is the total number of elements in both arrays
class UnionOfTwoSortedArrays {
    public void union(int[] arr1, int[] arr2) {
        int i=0, j=0;
        int m = arr1.length, n = arr2.length;
        while(i<m && j<n) {
            if(arr1[i] < arr2[j]) {
                if(i==0 || arr1[i] != arr1[i-1]) {//to avoid duplicates
                    System.out.print(arr1[i] + " ");
                }
                i++;
            } else if(arr1[i] > arr2[j]) {
                if(j==0 || arr2[j] != arr2[j-1]) {//to avoid duplicates
                    System.out.print(arr2[j] + " ");
                }
                j++;
            } else {
                if(i==0 || arr1[i] != arr1[i-1]) {//to avoid duplicates
                    System.out.print(arr1[i] + " ");
                }
                i++;
                j++;
            }
        }

        while(i<m) {
            if(i==0 || arr1[i] != arr1[i-1]) {//to avoid duplicates
                System.out.print(arr1[i] + " ");
            }
            i++;
        }

        while(j<n) {
            if(j==0 || arr2[j] != arr2[j-1]) {//to avoid duplicates
                System.out.print(arr2[j] + " ");
            }
            j++;
        }
    }
}
