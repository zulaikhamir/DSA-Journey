// LeetCode 134 - Gas Station
// https://leetcode.com/problems/gas-station/
// n gas stations in a circle; gas[i] fuel available, cost[i] fuel to travel to next station.
// Find the starting station index to complete the circuit, or -1 if impossible.
// Approach: if total gas >= total cost, a solution exists. Track running tank; whenever it
// goes negative, no station in [start, i] can be the answer, so restart from i+1.
// Time: O(n), Space: O(1)

public class GasStation {

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        System.out.println("Starting station: " + canCompleteCircuit(gas, cost));
    }

    static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0, currTank = 0, start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalTank += diff;
            currTank += diff;

            if (currTank < 0) {
                start = i + 1; // can't start anywhere in [start, i], try from the next station
                currTank = 0;
            }
        }

        return totalTank >= 0 ? start : -1;
    }
}
