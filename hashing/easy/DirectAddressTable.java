
public class DirectAddressTable {

    // Define the maximum possible key value
    static final int MAX = 10000;

    // Boolean array to represent the Direct Address Table
    static boolean[] table = new boolean[MAX];

    // Insert operation
    public static void insert(int key) {
        if (key >= 0 && key < MAX) {
            table[key] = true;
            System.out.println("Inserted key: " + key);
        } else {
            System.out.println("Key out of range.");
        }
    }

    // Search operation
    public static boolean search(int key) {
        if (key >= 0 && key < MAX) {
            return table[key];
        }
        System.out.println("Key out of range.");
        return false;
    }

    // Delete operation
    public static void delete(int key) {
        if (key >= 0 && key < MAX) {
            table[key] = false;
            System.out.println("Deleted key: " + key);
        } else {
            System.out.println("Key out of range.");
        }
    }

    // Main function to test the operations
    public static void main(String[] args) {
        insert(500);
        insert(1000);
        insert(9999);

        System.out.println("Is 500 present? " + search(500));   // true
        System.out.println("Is 9999 present? " + search(9999)); // true
        System.out.println("Is 1234 present? " + search(1234)); // false

        delete(500);
        System.out.println("Is 500 present after deletion? " + search(500)); // false
    }
}
