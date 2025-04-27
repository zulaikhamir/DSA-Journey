
public class rev {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.prev = null;
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = null;
        System.out.println("before reversing");
        printList(head);
        head = reverse(head);
        System.out.println("after reversing");
        printList(head);

    }

    static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node cur = head;

        // Traverse the entire doubly linked list to reverse it
        while (cur != null) {
            prev = cur.prev;  // Store the previous pointer of the current node into 'prev' (acts like a temporary variable)
            cur.prev = cur.next;  // Swap the 'prev' and 'next' pointers of the current node
            cur.next = prev;      // Assign the originally stored 'prev' value (before swap) to 'next' pointer
            cur = cur.prev;       // Move to the next node to be processed (originally the next node before swapping)
        }

// After the loop ends, 'prev' will be pointing to the node *after* the new head,
// so we return prev.prev to get the new head of the reversed list
        return prev.prev;

    }

    static void printList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;

        }
        System.out.println("null");
    }

    static class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

}
