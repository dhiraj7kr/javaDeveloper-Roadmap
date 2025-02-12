You are given a 0-indexed array nums consisting of positive integers. You can choose two indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of nums[j].

Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices i and j that satisfy the conditions.

 

Example 1:

Input: nums = [18,43,36,13,7]
Output: 54
Explanation: The pairs (i, j) that satisfy the conditions are:
- (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
- (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
So the maximum sum that we can obtain is 54.
Example 2:

Input: nums = [10,12,19,14]
Output: -1
Explanation: There are no two numbers that satisfy the conditions, so we return -1.
 

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 109

-------------------------------------------------------------

code:

class Solution {
    // Helper function to compute the sum of digits of a number
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        // HashMap to store the list of numbers grouped by the sum of their digits
        Map<Integer, List<Integer>> digitSumMap = new HashMap<>();

        // Group numbers by their sum of digits
        for (int num : nums) {
            int sum = digitSum(num);
            if (!digitSumMap.containsKey(sum)) {
                digitSumMap.put(sum, new ArrayList<>());
            }
            digitSumMap.get(sum).add(num);
        }

        int maxSum = -1;

        // Iterate through the digit sum groups
        for (Map.Entry<Integer, List<Integer>> entry : digitSumMap.entrySet()) {
            List<Integer> group = entry.getValue();
            if (group.size() > 1) {
                // Sort the group to find the two largest numbers
                Collections.sort(group, Collections.reverseOrder());
                // We need the sum of the two largest numbers
                int pairSum = group.get(0) + group.get(1);
                maxSum = Math.max(maxSum, pairSum);
            }
        }

        return maxSum;
    }
}
