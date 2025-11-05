
public class MajorityElement {//an element which appears more than n/2 times in an array
//naive solution 

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        int n = arr.length;
        int majorityCount = n / 2;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                System.out.println("Majority element is: " + arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No majority element");
        }
    }
}
