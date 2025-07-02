
public class UnionNaive {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        System.out.println("Union of the two sorted arrays:");

        // Print all elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // For each element in arr2, check if it is already in arr1
        for (int i = 0; i < arr2.length; i++) {
            boolean isPresent = false;

            // Linear search in arr1
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    isPresent = true;
                    break;
                }
            }

            // If not present, print it
            if (!isPresent) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
