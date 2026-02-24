
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        // Create a new HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // ----------- Add elements using add() -----------
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Print the HashSet
        System.out.println("Fruits HashSet: " + fruits);

        // ----------- Check if a value exists using contains() -----------
        if (fruits.contains("Banana")) {
            System.out.println("Banana is present in the set.");
        } else {
            System.out.println("Banana is not present in the set.");
        }

        // ----------- Get size using size() -----------
        System.out.println("Total number of fruits: " + fruits.size());

        // ----------- Iterate using Iterator -----------
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ----------- Iterate using for-each loop -----------
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ----------- Remove an element using remove() -----------
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // ----------- Check if set is empty using isEmpty() -----------
        System.out.println("Is the set empty? " + fruits.isEmpty());

        // ----------- Clear the set using clear() -----------
        fruits.clear();
        System.out.println("After clearing, is the set empty? " + fruits.isEmpty());
    }
}
