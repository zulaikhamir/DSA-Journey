//Leetcode 1984: Minimum Difference Between Highest and Lowest of K Scores similar
//but our question is simple find the minimum difference between the highest and lowest score in an array
//niave solution
//o(n^2) time complexity
class MinDifferenceInArray {
    public int minimumDifference(int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
               res= Math.min(res, Math.abs(nums[i] - nums[j]));

            }
        }
        return res;
    }

}
//efficient solution
//o(nlogn) time complexity
class MinDifferenceInArray {
    public int minimumDifference(int[] nums) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            res = Math.min(res, nums[i + 1] - nums[i]);
        }
        return res;
    }

}

