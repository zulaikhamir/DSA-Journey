
public class dllinsert {

    public static void main(String[] args) {

        Node head = new Node(10);
        int x = 20;
        int y = 30;

        System.out.println("insert front");
        head = insertFront(head, x);
        printList(head);

        System.out.println("insert back");
        head = insertBack(head, y);
        printList(head);

    }

    static Node insertFront(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null) {
            head.prev = temp;

        }
        return temp;

    }

    static Node insertBack(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            return temp;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = temp;
        temp.prev = cur;
        return head;

    }

    static void printList(Node head) {

        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data + " ");
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
            this.prev = null;
            this.next = null;
        }
    }

}
