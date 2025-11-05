
import java.util.HashSet;

public class UnionEfficient {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        // Create a HashSet to store the union
        HashSet<Integer> unionSet = new HashSet<>();

        // Add all elements of arr1 to the set
        for (int num : arr1) {
            unionSet.add(num);
        }

        // Add all elements of arr2 to the set
        for (int num : arr2) {
            unionSet.add(num);
        }

        // Print the union elements
        System.out.println("Union of the two arrays:");
        for (int num : unionSet) {
            System.out.print(num + " ");
        }
    }
}
