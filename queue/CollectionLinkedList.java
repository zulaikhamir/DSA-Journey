
import java.util.*;

public class CollectionLinkedList {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);  // add element
        queue.offer(20);
        queue.offer(30);

        System.out.println("Front: " + queue.peek()); // 10
        System.out.println("Removed: " + queue.poll()); // 10
        System.out.println("Now front: " + queue.peek()); // 20

        System.out.println("Size: " + queue.size()); // 2
        System.out.println("Is empty: " + queue.isEmpty()); // false
    }
}
