

//using do-while loop to traverse circular linked list
public class ArrayTraversal {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // make circular
        head.next.next.next.next = head;

        printCircularList(head);
    }

    static void printCircularList(Node head){

        if(head == null){
            return;
        }

        Node p = head;

        do{
            System.out.println(p.data);
            p = p.next;

        } while(p != head);
    }


    static class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}

//using for loop to traverse circular linked list
public class ArrayTraversal {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // make circular
        head.next.next.next.next = head;

        printCircularList(head);
    }

    static void printCircularList(Node head){

        if(head == null){
            return;
        }

        System.out.println(head.data);

        for(Node p = head.next; p != head; p = p.next){
            System.out.println(p.data);
        }
    }


    static class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
