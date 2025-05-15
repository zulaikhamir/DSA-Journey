
import java.util.Deque;
import java.util.LinkedList;

public class MinMaxDataStructure {

    private Deque<Integer> minDeque;
    private Deque<Integer> maxDeque;

    public MinMaxDataStructure() {
        minDeque = new LinkedList<>();
        maxDeque = new LinkedList<>();
    }

    public void insertMin(int x) {
        minDeque.addFirst(x);
    }

    public void insertMax(int x) {
        maxDeque.addLast(x);
    }

    public Integer getMin() {
        if (!minDeque.isEmpty()) {
            return minDeque.peekFirst();
        } else if (!maxDeque.isEmpty()) {
            return maxDeque.peekFirst();
        }
        return null;
    }

    public Integer getMax() {
        if (!maxDeque.isEmpty()) {
            return maxDeque.peekLast();
        } else if (!minDeque.isEmpty()) {
            return minDeque.peekLast();
        }
        return null;
    }

    public Integer extractMin() {
        if (!minDeque.isEmpty()) {
            return minDeque.pollFirst();
        } else if (!maxDeque.isEmpty()) {
            return maxDeque.pollFirst();
        }
        return null;
    }

    public Integer extractMax() {
        if (!maxDeque.isEmpty()) {
            return maxDeque.pollLast();
        } else if (!minDeque.isEmpty()) {
            return minDeque.pollLast();
        }
        return null;
    }

    public static void main(String[] args) {
        MinMaxDataStructure ds = new MinMaxDataStructure();

        ds.insertMin(5);
        ds.insertMax(10);
        ds.insertMin(3);
        ds.insertMax(15);
        ds.insertMin(2);

        System.out.println(ds.getMin()); // 2
        System.out.println(ds.getMax()); // 15

        ds.insertMin(1);
        System.out.println(ds.getMin()); // 1

        ds.insertMax(20);
        System.out.println(ds.getMax()); // 20
    }
}
