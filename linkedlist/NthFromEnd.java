
public class NthFromEnd {

    // Function to find nth node from end
    public static Node findNthFromEnd(Node head, int n) {
        if (head == null) {
            return null;
        }

        // Step 1: Calculate length
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Calculate the position from start
        int positionFromStart = length - n + 1;

        // If n is more than length, return null
        if (positionFromStart <= 0) {
            return null;
        }

        // Step 3: Traverse to the positionFromStart node
        current = head;
        for (int i = 1; i < positionFromStart; i++) {
            current = current.next;
        }

        return current;
    }

    // Utility to print the list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Example usage
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(25);

        System.out.println("Linked List:");
        printList(head);

        int n = 3;
        Node nthNode = findNthFromEnd(head, n);
        System.out.println(n + "th node from the end is: " + (nthNode != null ? nthNode.data : "null"));
    }

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
