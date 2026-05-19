//leetcode 287 - Find the Duplicate Number
public class RepeatingElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int n = arr.length;

        // Step 1: Find the intersection point in the cycle
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Step 2: Find the entrance to the cycle
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        System.out.println("The duplicate number is: " + slow);
    }
}
