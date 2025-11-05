
public class DeleteNode {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(360);

        System.out.println("delete ist");
        head = deleteFisrt(head);
        printList(head);

        System.out.println("delete last");
        head = deleteLast(head);
        printList(head);

    }

    static Node deleteFisrt(Node head) {
        if (head == null) {
            return null;
        } else {
            return head.next;
        }

    }

    static Node deleteLast(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }

        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;

        }
        cur.next = null;
        return head;
    }

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void printList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
        System.out.println("null");
    }
}
