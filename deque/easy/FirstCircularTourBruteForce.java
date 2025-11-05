
public class FirstCircularTourBruteForce {

    public static int firstCircularTour(int[] petrol, int[] distance) {
        int n = petrol.length;

        for (int start = 0; start < n; start++) {
            int currPetrol = 0;
            int count = 0;
            int i = start;

            while (count < n) {
                currPetrol += petrol[i] - distance[i];
                if (currPetrol < 0) {
                    break;
                }

                i = (i + 1) % n;
                count++;
            }

            if (count == n && currPetrol >= 0) {
                return start;
            }
        }

        return -1; // No valid starting point
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = firstCircularTour(petrol, distance);
        if (startIndex != -1) {
            System.out.println("Start at station: " + startIndex);
        } else {
            System.out.println("No possible tour");
        }
    }
}
