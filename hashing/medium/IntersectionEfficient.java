
import java.util.HashSet;

public class IntersectionEfficient {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Create a HashSet and add all elements of arr1 to it
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        System.out.println("Intersection of the two arrays:");

        // Traverse arr2 and check if element exists in the HashSet
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.println(num);
                // Remove the element to handle duplicates
                set.remove(num);
            }
        }
    }
}
