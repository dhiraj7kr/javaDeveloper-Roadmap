Here are some **array problems in Java** for practice, along with their solutions. These problems cover **basic, intermediate, and advanced** levels.

---

## 📌 **Basic Level**
### **1️⃣ Find the Largest Element in an Array**
#### **Problem Statement**  
Given an integer array `nums`, find the **maximum element** in the array.

#### **Example**
```java
Input: nums = [3, 7, 2, 9, 5]
Output: 9
```

#### **Solution**
```java
class LargestElement {
    public static int findLargest(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 9, 5};
        System.out.println("Largest element: " + findLargest(nums));
    }
}
```

---

## 📌 **Intermediate Level**
### **2️⃣ Move All Zeros to the End**
#### **Problem Statement**  
Given an array `nums`, move all **0s** to the end while maintaining the relative order of non-zero elements.

#### **Example**
```java
Input: nums = [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
```

#### **Solution**
```java
class MoveZeros {
    public static void moveZerosToEnd(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZerosToEnd(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }
}
```

---

### **3️⃣ Find the Second Largest Element**
#### **Problem Statement**  
Find the **second largest** element in an array.

#### **Example**
```java
Input: nums = [12, 35, 1, 10, 34, 1]
Output: 34
```

#### **Solution**
```java
class SecondLargest {
    public static int findSecondLargest(int[] nums) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest: " + findSecondLargest(nums));
    }
}
```

---

## 📌 **Advanced Level**
### **4️⃣ Find the Longest Consecutive Sequence**
#### **Problem Statement**  
Find the length of the **longest consecutive sequence** in an unsorted array.

#### **Example**
```java
Input: nums = [100, 4, 200, 1, 3, 2]
Output: 4  // Sequence: [1, 2, 3, 4]
```

#### **Solution (Using HashSet)**
```java
import java.util.HashSet;

class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) { // Check if it's the start of a sequence
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence: " + longestConsecutive(nums));
    }
}
```

---

### **5️⃣ Find the Subarray with the Largest Sum (Kadane's Algorithm)**
#### **Problem Statement**  
Find the **maximum sum** of a subarray using **Kadane’s Algorithm**.

#### **Example**
```java
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6  // Subarray: [4, -1, 2, 1]
```

#### **Solution**
```java
class MaxSubarray {
    public static int maxSubarraySum(int[] nums) {
        int maxSum = nums[0], currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum: " + maxSubarraySum(nums));
    }
}
```

---

## 🏁 **Summary of Problems**
| # | Problem | Difficulty | Time Complexity |
|---|---------|------------|----------------|
| 1️⃣ | Find the Largest Element | Easy | O(n) |
| 2️⃣ | Move All Zeros to the End | Medium | O(n) |
| 3️⃣ | Find the Second Largest Element | Medium | O(n) |
| 4️⃣ | Longest Consecutive Sequence | Hard | O(n) |
| 5️⃣ | Max Subarray Sum (Kadane's) | Hard | O(n) |

---

## 📚 **Next Steps**
- Solve variations of these problems.
- Practice with larger constraints.
- Implement these in **different programming languages**.
- Use **sorting and binary search** for optimization.

Let me know if you need **more problems**! 🚀
