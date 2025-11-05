
public class ArrayTraversal {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        // if (head == null) {
        //     return;
        // }
        Node p = head;
        // System.out.println(p.data);
        // for (p = head.next; p != head; p = p.next) {
        //     System.out.println(p.data);
        // }
        do {
            System.out.println(p.data);//In SLL, you stop when p == null.

            //In CLL, you stop when p == head again.
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

}
