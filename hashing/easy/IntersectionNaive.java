
public class IntersectionNaive {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        System.out.println("Intersection of the two arrays:");

        // Outer loop for arr1
        for (int i = 0; i < arr1.length; i++) {
            // Inner loop for arr2
            for (int j = 0; j < arr2.length; j++) {
                // If a common element is found, print it
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break; // Avoid duplicate prints for this element
                }
            }
        }
    }
}
