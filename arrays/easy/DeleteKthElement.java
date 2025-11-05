
public class DeleteKthElement {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        int k = 2;

        head = deleteeff(head, k);

        Node p = head;

        do {
            System.out.println(p.data);

            p = p.next;
        } while (p != head);

    }

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node deleteeff(Node head, int k) {

        if (head == null) {

            return null;
        }
        if (k == 1) {
            if (head.next == head) {
                return null; // Only one node
            }
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }

        Node cur = head;
        for (int i = 0; i < k - 2; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;

    }

}
// Why (k-2)?

// Because cur needs to stand just before the node to be deleted.
// For example:
// To delete 3rd node:
// You need to move 1 step from head (3 - 2 = 1).

