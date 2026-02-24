
import java.util.HashMap;
import java.util.Map;

public class FrequencyWithHashMap {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 5, 6, 7, 8};

        // Create a HashMap to store frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Traverse the array and update frequencies in the map
        for (int num : arr) {
            // If the element is already present, increase its count by 1
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                // If not present, add it with count 1
                freqMap.put(num, 1);
            }
        }

        // Print the frequencies
        System.out.println("Frequencies of elements:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
