
public class TripletSumSorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 8, 9};
        int target = 22;

        boolean found = findTriplet(arr, target);

        if (found) {
            System.out.println("Triplet exists");
        } else {
            System.out.println("No such triplet");
        }
    }

    static boolean findTriplet(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {//And since a triplet needs 3 elements, the last valid index for i is n-3 (so i < n-2).
            int left = i + 1;//ist element i also taken in sum left is 2nd element and right is 3rd
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("Triplet: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    return true;
                } else if (sum < target) {
                    left++; // Move left pointer to increase sum
                } else {
                    right--; // Move right pointer to decrease sum
                }
            }
        }

        return false;
    }
}
