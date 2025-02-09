# 🚀 Count Bad Pairs in an Array  

This repository contains an efficient **Java solution** to count the number of **bad pairs** in a given array.

---

## 📌 **Problem Statement**  
You are given a **0-indexed integer array** `nums`.  
A pair of indices **(i, j)** is a **bad pair** if:  
\[
i < j \quad \text{and} \quad j - i \neq nums[j] - nums[i]
\]
Your task is to return the **total number of bad pairs** in `nums`.

### **Example 1**
#### **Input**:
```java
nums = [4,1,3,3]
```
#### **Output**:
```java
5
```
#### **Explanation**:
The bad pairs are:  
- (0,1): `1 - 0 ≠ 1 - 4`
- (0,2): `2 - 0 ≠ 3 - 4`
- (0,3): `3 - 0 ≠ 3 - 4`
- (1,2): `2 - 1 ≠ 3 - 1`
- (2,3): `3 - 2 ≠ 3 - 3`  
Thus, there are **5 bad pairs**.

### **Example 2**
#### **Input**:
```java
nums = [1,2,3,4,5]
```
#### **Output**:
```java
0
```
#### **Explanation**:
All pairs satisfy the condition, so **no bad pairs** exist.

---

## 🏗️ **Solution Approach**  
### 🔹 **Mathematical Observation**
Rewriting the **good pair** condition:
\[
j - i = nums[j] - nums[i]
\]
Rearrange:
\[
nums[j] - j = nums[i] - i
\]
Define:
\[
\text{val} = nums[i] - i
\]
For a pair to be **good**, `val` should be the same for both indices.

### 🔹 **Efficient Strategy**
1. Compute **Total Pairs**:
   \[
   \frac{n(n-1)}{2}
   \]
2. Use a **HashMap** to track the frequency of `nums[i] - i`.
3. The **number of good pairs** is determined by previous occurrences of `val`.
4. Compute **bad pairs**:
   \[
   \text{badPairs} = \text{totalPairs} - \text{goodPairs}
   \]

---

## 💻 **Java Implementation**
```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = (n * (n - 1)) / 2; // Total possible pairs

        Map<Integer, Long> freq = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < n; i++) {
            int val = nums[i] - i;
            if (freq.containsKey(val)) {
                goodPairs += freq.get(val); // Add count of previous occurrences
            }
            freq.put(val, freq.getOrDefault(val, 0L) + 1);
        }

        return totalPairs - goodPairs;
    }
}
```

---

## ⏳ **Complexity Analysis**
| Operation  | Time Complexity | Space Complexity |
|------------|----------------|------------------|
| **`countBadPairs(nums)`** | **O(n)** | **O(n)** |

---

## 🛠️ **How to Run**
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/count-bad-pairs.git
   ```
2. Compile the Java program:
   ```sh
   javac Solution.java
   ```
3. Run the Java program:
   ```sh
   java Solution
   ```

---

## 🌟 **Features**
✅ **Optimized using HashMap**  
✅ **Runs in O(n) time complexity**  
✅ **Handles large constraints efficiently**  

---

## 👨‍💻 **Author**
👤 **Dhiraj Kumar**  
📧 Email: dhiraj7kr@gmail.com  
💻 GitHub: [@dhiraj7kr](https://github.com/dhiraj7kr)

---

## ⭐ **Support**
If you found this helpful, please ⭐ the repo! 🚀
