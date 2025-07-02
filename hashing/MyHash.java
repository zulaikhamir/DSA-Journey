// Java program to implement Open Addressing using Linear Probing

class MyHash {

    int[] arr;       // Array to store hash table elements
    int cap;         // Capacity of the hash table
    int size;        // Current number of elements in the hash table

    // Constructor to initialize hash table
    MyHash(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
        // Initialize all slots as -1 (empty)
        for (int i = 0; i < cap; i++) {
            arr[i] = -1;
        }
    }

    // Hash function: simple modulo operation
    int hash(int key) {
        return key % cap;
    }

    // Function to search for a key in the hash table
    boolean search(int key) {
        int h = hash(key); // Get hash value for the key
        int i = h;

        // Loop to check slots until an empty slot is found
        while (arr[i] != -1) {
            // If key found, return true
            if (arr[i] == key) {
                return true;
            }

            // Move to next slot (Linear Probing)
            i = (i + 1) % cap;

            // If we complete a full circle, key not present
            if (i == h) {
                return false;
            }
        }
        return false; // Key not found
    }

    // Function to insert a key into the hash table
    boolean insert(int key) {
        // If hash table is full, insertion not possible
        if (size == cap) {
            return false;
        }

        int h = hash(key); // Get hash value
        int i = h;

        // Find an empty (-1) or deleted (-2) slot
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != key) {
            i = (i + 1) % cap;
            // If full circle, stop
            if (i == h) {
                return false;
            }
        }

        // If the key is already present, do not insert duplicate
        if (arr[i] == key) {
            return false;
        }

        // Insert key at the found position
        arr[i] = key;
        size++;
        return true;
    }

    // Function to delete a key from the hash table
    boolean erase(int key) {
        int h = hash(key); // Get hash value
        int i = h;

        // Loop to find the key
        while (arr[i] != -1) {
            // If key found, mark slot as deleted (-2)
            if (arr[i] == key) {
                arr[i] = -2;
                size--;
                return true;
            }

            // Move to next slot (Linear Probing)
            i = (i + 1) % cap;

            // If full circle, key not present
            if (i == h) {
                return false;
            }
        }
        return false; // Key not found
    }

    // Function to display current state of the hash table
    void display() {
        for (int i = 0; i < cap; i++) {
            if (arr[i] >= 0) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print("_ "); // Print underscore for empty/deleted slot

            }
        }
        System.out.println();
    }

    // Driver code to test implementation
    public static void main(String[] args) {
        MyHash h = new MyHash(7);

        h.insert(49);
        h.insert(50);
        h.insert(51);
        h.insert(75);

        System.out.print("Current Hash Table: ");
        h.display();

        System.out.println("Search 51: " + h.search(51));
        System.out.println("Search 70: " + h.search(70));

        h.erase(50);
        System.out.print("After Deleting 50: ");
        h.display();

        h.insert(85);
        System.out.print("After Inserting 85: ");
        h.display();
    }
}
