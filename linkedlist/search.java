
public class search {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(240);
        head.next.next.next.next = new Node(520);

        int x = 240;

        int index = searchNode(head, x);
        System.out.println("found at index " + index);

    }

    static int searchNode(Node head, int x) {
        int pos = 1;
        Node curr = head;

        while (curr != null) {
            if (curr.data == x) {
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
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
