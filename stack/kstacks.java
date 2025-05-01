
import java.util.*;

public class kstacks {

    int[] arr;   // Array to store actual content
    int[] top;   // Array to store top of each stack
    int[] next;  // Array to store next entry (free or stack link)

    int k, n;    // k = number of stacks, n = size of arr
    int freeTop; // Points to beginning index of free list

    // Constructor
    public kstacks(int k, int n) {
        this.k = k;
        this.n = n;

        arr = new int[n];
        top = new int[k];
        next = new int[n];

        // Initialize all stacks as empty//is an inbuilt function its cleaner than for loop
        Arrays.fill(top, -1);

        // Initialize all spaces as free and create free list
        for (int i = 0; i < n - 1; i++) {
            next[i] = i + 1;
        }
        next[n - 1] = -1;

        freeTop = 0;
    }

    // Pushes 'item' into stack number 'sn'
    public void push(int item, int sn) {
        if (freeTop == -1) {
            System.out.println("Stack Overflow");
            return;
        }

        int i = freeTop;          // Get free index
        freeTop = next[i];        // Update freeTop

        arr[i] = item;            // Insert item

        next[i] = top[sn];        // Link old top to next of new element
        top[sn] = i;              // Update top
    }

    // Pops top item from stack number 'sn'
    public int pop(int sn) {
        if (top[sn] == -1) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }

        int i = top[sn];          // Get top index
        top[sn] = next[i];        // Update top to next element

        next[i] = freeTop;        // Add this index to free list
        freeTop = i;

        return arr[i];            // Return popped item
    }

    // Utility to print stack contents (for testing)
    public void printStack(int sn) {
        int i = top[sn];
        System.out.print("Stack " + sn + ": ");
        while (i != -1) {
            System.out.print(arr[i] + " ");
            i = next[i];
        }
        System.out.println();
    }

    // Sample test
    public static void main(String[] args) {
        kstacks ks = new kstacks(3, 6);  // 3 stacks, total size 6

        ks.push(100, 0);
        ks.push(200, 0);
        ks.push(300, 1);
        ks.push(400, 2);
        ks.push(500, 1);
        ks.push(600, 2);

        ks.printStack(0); // Stack 0: 200 100
        ks.printStack(1); // Stack 1: 500 300
        ks.printStack(2); // Stack 2: 600 400

        System.out.println("Popped from stack 0: " + ks.pop(0)); // 200
        System.out.println("Popped from stack 1: " + ks.pop(1)); // 500
    }
}
