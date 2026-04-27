//Delete kth element from circular linked list

//o(n) time complexity and o(1) space complexity

public class DeleteKthNaive {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node deleteKth(Node head, int k) {
        // This is missing:
        if (k > size) { throw new IllegalArgumentException("k out of bounds"); }

        // Case 1: empty list
        if (head == null) {
            return null;
        }

        // Case 2: delete first node (k = 1)
        if (k == 1) {

            // only one node in circular list
            if (head.next == head) {
                return null;
            }

            // find last node to update its next pointer
            Node cur = head;
            while (cur.next != head) {
                cur = cur.next;
            }

            // last node now points to second node
            cur.next = head.next;

            // move head forward
            head = head.next;

            return head;
        }

        // Case 3: delete any other kth node
        Node cur = head;

        // move to (k-1)th node
        for (int i = 0; i < k - 2; i++) {
            cur = cur.next;
        }

        // skip kth node
        cur.next = cur.next.next;//kth noe javas garbage  collector will automatically delete it

        return head;
    }
}


//o(1)
public class DeleteKthEfficient {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node deleteKth(Node head, int k) {

        // empty list
        if (head == null) {
            return null;
        }

        // delete first node
        if (k == 1) {

            // only one node
            if (head.next == head) {
                return null;
            }

            // copy data from second node into head
            head.data = head.next.data;

            // delete second node
            head.next = head.next.next;

            return head;
        }

        // move to node before kth node
        Node cur = head;

        // why k-2?
        // because cur should stop at (k-1)th node
        // so that cur.next is kth node

        for (int i = 0; i < k - 2; i++) {
            cur = cur.next;
        }

        // remove kth node
        cur.next = cur.next.next;

        return head;
    }
}





// public class DeleteKthElement {

//     public static void main(String[] args) {

//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);
//         head.next.next.next.next = head;

//         int k = 2;

//         head = deleteeff(head, k);

//         Node p = head;

//         do {
//             System.out.println(p.data);

//             p = p.next;
//         } while (p != head);

//     }

//     static class Node {

//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static Node deleteeff(Node head, int k) {

//         if (head == null) {

//             return null;
//         }
//         if (k == 1) {
//             if (head.next == head) {
//                 return null; // Only one node
//             }
//             head.data = head.next.data;
//             head.next = head.next.next;
//             return head;
//         }

//         Node cur = head;
//         for (int i = 0; i < k - 2; i++) {
//             cur = cur.next;
//         }
//         cur.next = cur.next.next;
//         return head;

//     }

// }
// Why (k-2)?

// Because cur needs to stand just before the node to be deleted.
// For example:
// To delete 3rd node:
// You need to move 1 step from head (3 - 2 = 1).

// # Summary — why we use `this`

// ## Core idea

// `this` refers to the **current object**.

// It tells Java:

// > "Use the variable that belongs to this object, not the local parameter."

// ---

// # When `this` is REQUIRED

// When constructor parameter name is same as instance variable name.

// Example:

// ```java
// class Node {

//     int data;

//     Node(int data) {

//         this.data = data;
//     }
// }
// ```

// Without `this`:

// ```java
// Node(int data) {
//     data = data;   // wrong
// }
// ```

// Both `data` refer to parameter → instance variable never gets value.

// Object remains:

// ```
// data = 0   (default int value)
// ```

// ---

// # When `this` is OPTIONAL

// When parameter name is different.

// Example:

// ```java
// Node(int d) {

//     data = d;
// }
// ```

// Java understands:

// ```
// instance variable = parameter
// ```

// ---

// # Why developers still use `this`

// Consistency and readability.

// Cleaner:

// ```java
// this.data = data;
// this.next = null;
// ```

// instead of mixing styles.

// ---

// # In your Node class

// Both are correct:

// ### Version 1

// ```java
// Node(int d) {

//     data = d;
// }
// ```

// ### Version 2 (preferred style)

// ```java
// Node(int data) {

//     this.data = data;
// }
// ```

// ---

// # One-line rule

// Use `this` when:

// ```
// parameter name == instance variable name
// ```

// so Java knows which one you mean.
