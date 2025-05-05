
public class deletedll {

    public static void main(String[] args) {

        Node head = new Node(10);

        Node second = new Node(20);

        Node third = new Node(30);
        head.next = second;
        head.prev = null;
        second.next = third;
        second.prev = null;
        third.prev = second;
        third.next = null;

        head = deleteHead(head);
        System.out.println("after deleteing head");
        printList(head);
        System.out.println("after deleting last");
        head = deleteLast(head);

        printList(head);

    }

    static Node deleteHead(Node head) {
        // If head is null, it means the list is empty.
// If head.next is also null, it means the list has only one node.
// After deleting, the list becomes completely empty (null).

        if (head == null || head.next == null) {
            return null;
        }

        Node cur = head.next;
        cur.prev = null;

        return cur;
    }

    static Node deleteLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }

        cur.next = null;// Remove the last node by setting second last node's next to null

        return head;

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

    static void printList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
        System.out.println("null");
    }
}
