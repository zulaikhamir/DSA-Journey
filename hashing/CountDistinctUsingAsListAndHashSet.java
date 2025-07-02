
import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctUsingAsListAndHashSet {

    public static void main(String[] args) {
        Integer[] arr = {4, 5, 4, 5, 6, 7, 8, 6};

        // Convert array to List using Arrays.asList() and then to HashSet to remove duplicates
        HashSet<Integer> distinctSet = new HashSet<>(Arrays.asList(arr));

        // The size of the set is the number of distinct elements
        System.out.println("Total number of distinct elements: " + distinctSet.size());
    }
}
