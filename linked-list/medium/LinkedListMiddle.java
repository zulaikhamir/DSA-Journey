
public class LinkedListMiddle {

    // Function to find the middle node
    public static Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        // Step 1: Count the number of nodes
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Step 2: Traverse to the middle node
        int midIndex = count / 2;
        current = head;
        for (int i = 0; i < midIndex; i++) {
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Linked List:");
        printList(head);

        Node middle = findMiddle(head);
        System.out.println("Middle node is: " + (middle != null ? middle.data : "null"));
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
