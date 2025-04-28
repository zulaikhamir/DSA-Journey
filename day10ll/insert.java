
public class insert {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        int data = 100;
        int dataa = 500;

        head = insert(head, data);
        head = inserteff(head, dataa);

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

    static Node inserteff(Node head, int dataa) {
        Node temp = new Node(dataa);
        if (head == null) {
            temp.next = temp;
            return temp;
        }

        temp.next = head.next;
        head.next = temp;
        int t = temp.data;
        temp.data = head.data;
        head.data = t;
        return temp;

    }

    static Node insert(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        Node cur = head;
        while (cur.next != head) {
            cur = cur.next;

        }
        cur.next = temp;
        temp.next = head;
        return head;

    }

}
// inserteff() is more efficient because it does insertion in O(1) time — without traversing the list.

// insert() is simple but slower — O(n) time — because it has to find the last node.

// So:
