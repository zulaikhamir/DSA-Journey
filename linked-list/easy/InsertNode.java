
public class InsertNode {

    public static void main(String[] args) {
        int beg = 20;  // Data to be inserted at the beginning
        int end = 30;  // Data to be inserted at the end
        int pos = 40;  // Data to be inserted at a specific position
        int position = 4;  // Position where the data is to be inserted

        // Create the head of the linked list with a single node having value 10
        Node head = new Node(10);
        printList(head);  // Print the initial linked list

        // Insert at the beginning
        System.out.println("Insert at beginning:");
        head = insertBeginning(head, beg);
        printList(head);  // Print after inserting at the beginning

        // Insert at the given position
        System.out.println("Insert at position:");
        head = insertPos(head, position, pos);
        printList(head);  // Print after inserting at the given position

        // Insert at the end
        System.out.println("Insert at end:");
        head = insertEnd(head, end);
        printList(head);  // Print after inserting at the end
    }

    // Node class represents each node of the linked list
    static class Node {

        int data;  // Data in the node
        Node next; // Pointer to the next node in the list

        // Constructor to create a node with the given data
        Node(int data) {
            this.data = data;
            this.next = null;  // By default, the next pointer is null
        }
    }

    // Method to insert a node at the beginning of the list
    static Node insertBeginning(Node head, int data) {
        Node temp = new Node(data);  // Create a new node with the given data
        temp.next = head;  // Make the new node's next pointer point to the current head
        return temp;  // Return the new node, which is now the head of the list
    }

    // Method to insert a node at the end of the list
    static Node insertEnd(Node head, int data) {
        Node endNode = new Node(data);  // Create a new node with the given data
        if (head == null) {  // If the list is empty
            return endNode;  // The new node becomes the head of the list
        }

        Node curr = head;
        while (curr.next != null) {  // Traverse to the last node
            curr = curr.next;
        }
        curr.next = endNode;  // Link the last node's next pointer to the new node
        return head;  // Return the original head of the list
    }

    // Method to insert a node at a specific position in the list
    static Node insertPos(Node head, int position, int data) {
        Node temp = new Node(data);  // Create a new node with the given data
        if (position == 1) {  // If the position is 1, insert at the beginning
            temp.next = head;
            return temp;  // Return the new node, which becomes the new head
        }

        Node cur = head;
        // Traverse the list to find the node just before the desired position
        for (int i = 1; i < position - 1 && cur != null; i++) {
            cur = cur.next;
        }

        if (cur == null) {  // If the position is out of bounds
            System.out.println("Position out of bounds!");
            return head;  // Return the original list without any modification
        }

        // Insert the new node at the desired position
        temp.next = cur.next;  // Make the new node point to the next node
        cur.next = temp;  // Make the current node point to the new node
        return head;  // Return the original head of the list
    }

    // Utility method to print the linked list
    static void printList(Node head) {
        Node curr = head;
        // Traverse the list and print each node's data
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");  // End of the list
    }
}
