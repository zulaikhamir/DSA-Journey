
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeTraversal {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // Inserting elements
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        deque.addLast(40);

        // Traversal using Iterator (front to rear)
        System.out.println("Traversal using Iterator (front to rear):");
        Iterator<Integer> it = deque.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Traversal using for-each loop
        System.out.println("Traversal using for-each loop:");
        for (int num : deque) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Traversal using DescendingIterator (rear to front)
        System.out.println("Traversal using DescendingIterator (rear to front):");
        Iterator<Integer> descIt = deque.descendingIterator();
        while (descIt.hasNext()) {
            System.out.print(descIt.next() + " ");
        }
        System.out.println();
    }
}
