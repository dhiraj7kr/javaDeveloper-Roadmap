QUESTION
---------------------------------------
Given a positive integer n, return the punishment number of n.

The punishment number of n is defined as the sum of the squares of all integers i such that:

1 <= i <= n
The decimal representation of i * i can be partitioned into contiguous substrings such that the sum of the integer values of these substrings equals i.
 

Example 1:

Input: n = 10
Output: 182
Explanation: There are exactly 3 integers i in the range [1, 10] that satisfy the conditions in the statement:
- 1 since 1 * 1 = 1
- 9 since 9 * 9 = 81 and 81 can be partitioned into 8 and 1 with a sum equal to 8 + 1 == 9.
- 10 since 10 * 10 = 100 and 100 can be partitioned into 10 and 0 with a sum equal to 10 + 0 == 10.
Hence, the punishment number of 10 is 1 + 81 + 100 = 182
Example 2:

Input: n = 37
Output: 1478
Explanation: There are exactly 4 integers i in the range [1, 37] that satisfy the conditions in the statement:
- 1 since 1 * 1 = 1. 
- 9 since 9 * 9 = 81 and 81 can be partitioned into 8 + 1. 
- 10 since 10 * 10 = 100 and 100 can be partitioned into 10 + 0. 
- 36 since 36 * 36 = 1296 and 1296 can be partitioned into 1 + 29 + 6.
Hence, the punishment number of 37 is 1 + 81 + 100 + 1296 = 1478
--------------------------------------------------------


ANSWER:
----------------------------------------------------------------
 class Solution {
    public int punishmentNumber(int n) {
        int result = 0;
        
        // Loop through all integers from 1 to n
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            String squareStr = String.valueOf(square);
            
            // Try all possible ways to partition the string representation of the square
            if (canPartition(squareStr, i)) {
                result += square;
            }
        }
        
        return result;
    }
    
    // Helper function to check if a given number can be partitioned
    // such that the sum of the parts equals the original number
    private boolean canPartition(String squareStr, int target) {
        return partitionHelper(squareStr, 0, 0, target);
    }

    // Backtracking approach to try all partitions of the string
    private boolean partitionHelper(String s, int start, int sum, int target) {
        if (start == s.length()) {
            return sum == target;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            // Get the substring and convert it to integer
            String part = s.substring(start, end);
            // Skip leading zeros unless it's a single '0'
            if (part.length() > 1 && part.charAt(0) == '0') {
                continue;
            }
            
            int num = Integer.parseInt(part);
            if (partitionHelper(s, end, sum + num, target)) {
                return true;
            }
        }
        
        return false;
    }
}

