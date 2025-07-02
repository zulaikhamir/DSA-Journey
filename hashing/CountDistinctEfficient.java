
import java.util.HashSet;

public class CountDistinctEfficient {

    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 5, 6, 7, 8, 6};

        // Create a HashSet to store distinct elements
        HashSet<Integer> set = new HashSet<>();

        // Add each element to the set (duplicates will be ignored automatically)
        for (int num : arr) {
            set.add(num);
        }

        // The size of the set gives the number of distinct elements
        System.out.println("Total number of distinct elements: " + set.size());
    }
}
