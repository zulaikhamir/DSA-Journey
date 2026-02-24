
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {


    public static void main(String[] args) {
        // Create a new HashMap with Integer keys and String values
        HashMap<Integer, String> studentMap = new HashMap<>();

        // ----------- Add elements using put() -----------
        studentMap.put(101, "Zara");
        studentMap.put(102, "Ali");
        studentMap.put(103, "Fatima");

        // Print the HashMap
        System.out.println("Student Map: " + studentMap);

        // ----------- Get a value using get(key) -----------
        String studentName = studentMap.get(102);
        System.out.println("Student with roll no 102: " + studentName);

        // ----------- Remove a key-value pair using remove(key) -----------
        studentMap.remove(103);
        System.out.println("After removing roll no 103: " + studentMap);

        // ----------- Check if a key exists using containsKey() -----------
        boolean hasKey = studentMap.containsKey(101);
        System.out.println("Does roll no 101 exist? " + hasKey);

        // ----------- Check if a value exists using containsValue() -----------
        boolean hasValue = studentMap.containsValue("Fatima");
        System.out.println("Does value 'Fatima' exist? " + hasValue);

        // ----------- Get size of the map using size() -----------
        System.out.println("Total students in map: " + studentMap.size());

        // ----------- Get the set of entries using entrySet() -----------
        Set<Map.Entry<Integer, String>> entries = studentMap.entrySet();
        System.out.println("Entries in the map:");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // ----------- Get value for a key using get() again -----------
        String name = studentMap.get(101);
        System.out.println("Name of student with roll no 101: " + name);
    }
}
