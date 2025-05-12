
public class RepeatingElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        int slow = arr[0];
        int fast = arr[0];

        // Detect cycle
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Find start of the cycle (duplicate number)
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        System.out.println("Repeating element is: " + slow);
    }
}
