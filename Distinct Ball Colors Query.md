### **Distinct Ball Colors Query**  

## **Problem Statement**  
You are given:  
1. An integer `limit`, representing `limit + 1` distinct balls labeled in the range `[0, limit]`.  
2. A 2D array `queries` of size `n x 2`, where each query is of the form `[x, y]`, indicating that ball `x` is assigned color `y`.  

After processing each query, you need to determine the number of **distinct colors** present among the balls.  

**Note:**  
- If a ball is recolored, its previous color is removed.  
- Uncolored balls do not contribute to the distinct color count.  

---

## **Example Walkthrough**  

### **Example 1**  

#### **Input**  
```java
limit = 4
queries = [[1,4], [2,5], [1,3], [3,4]]
```

#### **Output**  
```java
[1,2,2,3]
```

#### **Explanation**  
| Query | Ball Coloring | Distinct Colors Count |
|--------|----------------|---------------------|
| `[1,4]`  | Ball `1` → Color `4` | `1` |
| `[2,5]`  | Ball `1` → Color `4`, Ball `2` → Color `5` | `2` |
| `[1,3]`  | Ball `1` → Color `3`, Ball `2` → Color `5` | `2` (Color `4` removed) |
| `[3,4]`  | Ball `1` → Color `3`, Ball `2` → Color `5`, Ball `3` → Color `4` | `3` |

---

### **Example 2**  

#### **Input**  
```java
limit = 4
queries = [[0,1], [1,2], [2,2], [3,4], [4,5]]
```

#### **Output**  
```java
[1,2,2,3,4]
```

#### **Explanation**  
| Query | Ball Coloring | Distinct Colors Count |
|--------|----------------|---------------------|
| `[0,1]`  | Ball `0` → Color `1` | `1` |
| `[1,2]`  | Ball `0` → Color `1`, Ball `1` → Color `2` | `2` |
| `[2,2]`  | Ball `0` → Color `1`, Ball `1` → Color `2`, Ball `2` → Color `2` | `2` |
| `[3,4]`  | Ball `0` → Color `1`, Ball `1` → Color `2`, Ball `2` → Color `2`, Ball `3` → Color `4` | `3` |
| `[4,5]`  | Ball `0` → Color `1`, Ball `1` → Color `2`, Ball `2` → Color `2`, Ball `3` → Color `4`, Ball `4` → Color `5` | `4` |

---

## **Constraints**  
- `1 <= limit <= 10^9`  
- `1 <= n == queries.length <= 10^5`  
- `queries[i].length == 2`  
- `0 <= queries[i][0] <= limit`  
- `1 <= queries[i][1] <= 10^9`  

---

## **Solution Approach**  

### **1. Data Structures Used**
- `Map<Integer, Integer> ballColorMap` → Stores `{ball → color}` assignments.  
- `Map<Integer, Integer> colorFrequency` → Tracks occurrences of each color.  
- `int distinctColorCount` → Keeps count of unique colors.  

### **2. Algorithm**
1. **Iterate** through the `queries` array.  
2. **Check if the ball already has a color**:
   - If yes, **decrement** the count of the old color.  
   - If the color count becomes `0`, **remove** it and decrease `distinctColorCount`.  
3. **Assign the new color** to the ball and update its count in `colorFrequency`.  
4. **If the new color appears for the first time**, increase `distinctColorCount`.  
5. **Store the current `distinctColorCount` in the result array** after each query.  

### **Time Complexity Analysis**
- Each query involves **constant-time updates** (`O(1)`) in two hash maps.  
- Since we process `n` queries, the total complexity is **O(n)**.  

---

## **Java Implementation**  

```java
import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballColorMap = new HashMap<>();
        Map<Integer, Integer> colorFrequency = new HashMap<>();
        int[] result = new int[queries.length];
        int distinctColorCount = 0;

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            // If the ball was already colored, remove the previous color
            if (ballColorMap.containsKey(ball)) {
                int oldColor = ballColorMap.get(ball);
                colorFrequency.put(oldColor, colorFrequency.get(oldColor) - 1);

                // If the old color is no longer present, remove it from count
                if (colorFrequency.get(oldColor) == 0) {
                    colorFrequency.remove(oldColor);
                    distinctColorCount--;
                }
            }

            // Assign the new color
            ballColorMap.put(ball, color);
            colorFrequency.put(color, colorFrequency.getOrDefault(color, 0) + 1);

            // If the color appears for the first time, increase distinctColorCount
            if (colorFrequency.get(color) == 1) {
                distinctColorCount++;
            }

            // Store the distinct color count
            result[i] = distinctColorCount;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int limit1 = 4;
        int[][] queries1 = {{1,4}, {2,5}, {1,3}, {3,4}};
        System.out.println(Arrays.toString(solution.queryResults(limit1, queries1))); // Output: [1,2,2,3]

        int limit2 = 3;
        int[][] queries2 = {{0,1}, {1,2}, {2,1}, {0,3}};
        System.out.println(Arrays.toString(solution.queryResults(limit2, queries2))); // Output: [1,2,2,3]
    }
}
```

---

## **How to Run the Code**
1. **Copy the code** into a file named `Solution.java`.  
2. **Compile the Java program**:  
   ```
   javac Solution.java
   ```
3. **Run the Java program**:  
   ```
   java Solution
   ```
4. The expected output should match the examples provided.  

---

## **Key Takeaways**
✔ **Optimized Approach**: Uses HashMaps for O(1) query handling.  
✔ **Efficient Updates**: Colors are updated dynamically.  
✔ **Handles Large Constraints**: Works well for `n = 10^5` queries.  

🚀 *Now you can use this solution to efficiently process large sets of queries in real time!*
