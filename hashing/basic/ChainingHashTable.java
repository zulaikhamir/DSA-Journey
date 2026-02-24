
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class MyHash {

//     Use an ArrayList to represent your entire hash table — it lets you quickly access any bucket using an index
// Use a LinkedList at each index (bucket) to store keys that collide (have the same hash value)
// 📌 What it means:
// ArrayList is the main table
// Each entry in the table is a LinkedList of keys
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    // 'BUCKET' stores the total number of buckets in the hash table.
// 'table' is an ArrayList where each index (bucket) contains a LinkedList to handle collisions using chaining.

    // Constructor
    MyHash(int b) {
        BUCKET = b;
        table = new ArrayList<>(BUCKET);

        // Create an ArrayList named 'table' with capacity 'BUCKET' to represent the hash table.
// Each index of this ArrayList will act as a bucket and hold a LinkedList for chaining.
        for (int i = 0; i < BUCKET; i++) {
            table.add(new LinkedList<>());
            // Initialize each bucket in the hash table by adding an empty LinkedList at every index.
// This ensures each bucket is ready to store keys when collisions happen.

        }
    }

    // Insert key into hash table
    void insert(int key) {
        int i = key % BUCKET;//hash function to determine the bucket index for the given key
        if (!table.get(i).contains(key)) {
            table.get(i).add(key);
            System.out.println("Inserted key " + key + " at bucket " + i);
        } else {
            System.out.println("Key " + key + " already exists at bucket " + i);
        }
    }

    // Remove key from hash table
    void remove(int key) {
        int i = key % BUCKET;
        if (table.get(i).remove((Integer) key)) {
            System.out.println("Removed key " + key + " from bucket " + i);
        } else {
            System.out.println("Key " + key + " not found in bucket " + i);
        }
    }

    // Search key in hash table
    boolean search(int key) {
        int i = key % BUCKET;
        return table.get(i).contains(key);
    }

    // Display the hash table
    void display() {
        System.out.println("\nHash Table:");
        for (int i = 0; i < BUCKET; i++) {
            System.out.print("Bucket " + i + ": ");
            for (int key : table.get(i)) {
                System.out.print(key + " -> ");
            }
            System.out.println("null");
        }
    }
}

public class ChainingHashTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User-defined bucket size
        System.out.print("Enter number of buckets: ");
        int size = sc.nextInt();

        MyHash hashTable = new MyHash(size);

        while (true) {
            System.out.println("\n1. Insert\n2. Remove\n3. Search\n4. Display\n5. Exit");
            System.out.print("Choose operation: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key to insert: ");
                    int insertKey = sc.nextInt();
                    hashTable.insert(insertKey);
                    break;
                case 2:
                    System.out.print("Enter key to remove: ");
                    int removeKey = sc.nextInt();
                    hashTable.remove(removeKey);
                    break;
                case 3:
                    System.out.print("Enter key to search: ");
                    int searchKey = sc.nextInt();
                    if (hashTable.search(searchKey)) {
                        System.out.println("Key " + searchKey + " found.");
                    } else {
                        System.out.println("Key " + searchKey + " not found.");
                    }
                    break;
                case 4:
                    hashTable.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
