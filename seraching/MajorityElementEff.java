
public class MajorityElementEff {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3};
        int n = arr.length;

        // Step 1: Find candidate
        int count = 0, candidate = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println("No majority element");
        }
    }
}
