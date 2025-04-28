
public class delete {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        head = deletee(head);
        head = deleteeff(head);

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

    static Node deleteeff(Node head) {

        if (head == null || head.next == null) {

            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;

    }

    static Node deletee(Node head) {

        if (head == null || head.next == null) {

            return null;
        }
        Node cur = head;
        while (cur.next != head) {
            cur = cur.next;

        }
        cur.next = head.next;

        return cur.next;

    }

}
