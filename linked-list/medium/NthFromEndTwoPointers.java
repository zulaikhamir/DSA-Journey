
public class NthFromEndTwoPointers {

    // Function to find nth node from the end using two pointers
    public static Node findNthFromEnd(Node head, int n) {
        if (head == null) {
            return null;
        }

        Node fast = head;
        Node slow = head;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                // n is greater than length of the list
                return null;
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
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
