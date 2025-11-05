
public class FirstCircularTourEfficient {

    public static int firstCircularTour(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0;
        int currSurplus = 0;
        int totalSurplus = 0;

        for (int i = 0; i < n; i++) {
            int gain = petrol[i] - distance[i];
            currSurplus += gain;
            totalSurplus += gain;

            if (currSurplus < 0) {
                start = i + 1;
                currSurplus = 0;
            }
        }

        return (totalSurplus >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = firstCircularTour(petrol, distance);
        System.out.println(startIndex != -1 ? "Start at station: " + startIndex : "No possible tour");
    }
}
