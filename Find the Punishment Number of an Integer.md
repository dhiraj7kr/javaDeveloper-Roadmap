To solve this problem, we need to determine the "punishment number" of a given integer `n`. The punishment number is the sum of the squares of all integers `i` such that their square can be partitioned into contiguous substrings where the sum of these substrings equals the integer `i` itself.

Here’s a step-by-step breakdown of how we can approach the problem:

1. **Iterate over all integers from 1 to `n`:** For each number `i`, compute its square `i * i`.
   
2. **Check if the square can be partitioned into substrings:** For a number `i`, check if its square can be split into contiguous substrings that sum up to `i`.

3. **Sum the squares of valid numbers:** If a number satisfies the condition, add its square to the result.

### Key Functions:
- **Partitioning and Summing:** For a given `i`, check if the square `i * i` can be split into substrings, and the sum of these substrings equals `i`.

### Solution Code:

```java
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
```

### Explanation:

1. **`punishmentNumber` Method:**
   - We loop over all integers `i` from `1` to `n`.
   - For each integer `i`, we calculate `i * i` and convert it to a string.
   - We then check if the string representation of the square can be partitioned such that the sum of the parts equals `i`.

2. **`canPartition` Method:**
   - This method initiates the partitioning process by calling `partitionHelper` with initial parameters.

3. **`partitionHelper` Method:**
   - This is a backtracking function that tries all possible partitions of the string representation of the square.
   - It recursively explores substrings and sums their integer values, checking if they can sum up to `i`.

4. **Backtracking Logic:**
   - We use recursion to generate all possible partitions of the square’s string representation.
   - If we reach the end of the string and the sum equals `i`, we return `true`.

5. **Efficiency Considerations:**
   - The backtracking will ensure that we explore all valid partitions, while checking for numbers with leading zeros or invalid partitions.

### Example Walkthrough:

For `n = 10`:
- **1**: `1 * 1 = 1` (sum of parts is 1).
- **9**: `9 * 9 = 81` (partition 81 into 8 + 1, sum = 9).
- **10**: `10 * 10 = 100` (partition 100 into 10 + 0, sum = 10).

The punishment number of 10 will be: `1 + 81 + 100 = 182`.

### Time Complexity:
The time complexity of this solution depends on the number of substrings we try for each number's square. For each number `i`, the square can be split in multiple ways, and we explore these substrings recursively. The worst-case time complexity is approximately `O(n * m^2)`, where `m` is the number of digits in `i * i`. This is a feasible solution for reasonable input sizes.

