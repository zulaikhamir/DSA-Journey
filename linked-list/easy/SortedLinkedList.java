
public class SortedLinkedList {

    // Insert a new node while maintaining the sorted order
    public static Node insertSorted(Node head, int value) {
        Node newNode = new Node(value);

        // If list is empty or new value should be placed at head
        if (head == null || value < head.data) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;

        // Traverse to find the correct spot
        while (current.next != null && current.next.data < value) {
            current = current.next;
        }

        // Insert node
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    // Utility function to print the list
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
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);

        System.out.println("Before Insertion:");
        printList(head);

        head = insertSorted(head, 4); // Inserting 4

        System.out.println("After Insertion:");
        printList(head);
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
