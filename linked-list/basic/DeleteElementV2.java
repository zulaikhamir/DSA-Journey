//using O(n) time complexity
//delete head node of circular linked list

public class DeleteHeadON {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        head = deleteHead(head);

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
        }
    }

    static Node deleteHead(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node curr = head;

        while (curr.next != head) {
            curr = curr.next;
        }

        curr.next = head.next;

        return head.next;
    }
}


//using O(1) time complexity
public class DeleteHeadO1 {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        head = deleteHeadEfficient(head);

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
        }
    }

    static Node deleteHeadEfficient(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        head.data = head.next.data;
        head.next = head.next.next;

        return head;
    }
}
