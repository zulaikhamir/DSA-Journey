
import java.util.HashMap;

public class LongestEqualZeroOne {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 1};

        // Replace 0 with -1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        // HashMap to store prefixSum and its first occurrence index
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // If prefixSum is 0, subarray from 0 to i has equal 0s and 1s
            if (prefixSum == 0) {
                maxLength = i + 1;
            }

            // If this prefixSum was seen before, update maxLength
            if (prefixSumMap.containsKey(prefixSum)) {
                int length = i - prefixSumMap.get(prefixSum);
                if (length > maxLength) {
                    maxLength = length;
                }
            } else {
                // Store prefixSum with first occurrence index
                prefixSumMap.put(prefixSum, i);
            }
        }

        System.out.println("Length of longest subarray with equal number of 0s and 1s is: " + maxLength);
    }
}
// 📌 Idea:
// The trick is to replace every 0 with -1 and then use the "longest subarray with sum zero" problem technique.

// After replacing 0 → -1

// Then, find the longest subarray whose sum is 0 using prefix sum + HashMap


class Solution {

    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int balance = 0;
        int maxLength = 0;

        // important: balance 0 occurs before array starts
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                balance += 1;
            } else {
                balance -= 1;
            }

            if (map.containsKey(balance)) {

                int length = i - map.get(balance);
                maxLength = Math.max(maxLength, length);

            } else {

                map.put(balance, i);
            }
        }

        return maxLength;
    }
}
