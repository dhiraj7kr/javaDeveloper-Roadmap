### 📌 Number Containers System

This repository contains an implementation of the **Number Containers** system in Java. The system allows inserting or replacing numbers at specific indices and finding the smallest index associated with a given number efficiently.

---

## 🚀 Problem Statement

You need to design a **Number Containers** system with the following operations:

1. **Insert or Replace** a number at the given index in the system.
2. **Return the smallest index** for the given number in the system.

### Class Definition:
```java
class NumberContainers {
    public NumberContainers();
    public void change(int index, int number);
    public int find(int number);
}
```

### Methods:
- **`NumberContainers()`**: Initializes the number container system.
- **`void change(int index, int number)`**:
  - Inserts or updates the `index` with the `number`.
  - If an index already has a number, it gets replaced.
- **`int find(int number)`**:
  - Returns the smallest index that contains `number`.
  - Returns `-1` if the number is not found.

---

## 📝 Example Usage

```java
NumberContainers nc = new NumberContainers();

System.out.println(nc.find(10)); // Output: -1 (No index contains 10)
nc.change(2, 10);
nc.change(1, 10);
nc.change(3, 10);
nc.change(5, 10);
System.out.println(nc.find(10)); // Output: 1 (Smallest index with 10)

nc.change(1, 20);
System.out.println(nc.find(10)); // Output: 2 (Index 1 was replaced with 20)
```

---

## 🏗️ Implementation

```java
import java.util.*;

class NumberContainers {

    private Map<Integer, Integer> indexToNumber; // Maps index to number
    private Map<Integer, TreeSet<Integer>> numberToIndices; // Maps number to a sorted set of indices

    public NumberContainers() {
        indexToNumber = new HashMap<>();
        numberToIndices = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if (indexToNumber.containsKey(index)) {
            int oldNumber = indexToNumber.get(index);
            if (oldNumber != number) {
                numberToIndices.get(oldNumber).remove(index);
                if (numberToIndices.get(oldNumber).isEmpty()) {
                    numberToIndices.remove(oldNumber);
                }
            }
        }

        indexToNumber.put(index, number);
        numberToIndices.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }
    
    public int find(int number) {
        if (!numberToIndices.containsKey(number) || numberToIndices.get(number).isEmpty()) {
            return -1;
        }
        return numberToIndices.get(number).first(); // Return the smallest index
    }
}
```

---

## 📊 Complexity Analysis

| Operation | Time Complexity |
|-----------|----------------|
| `change(index, number)` | **O(log N)** (TreeSet operations) |
| `find(number)` | **O(1)** (Retrieving smallest index) |

- **TreeSet** ensures that indices remain sorted, enabling efficient lookup of the smallest index.

---

## 🛠️ How to Run

1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/number-containers.git
   ```
2. Compile the Java program:
   ```sh
   javac NumberContainers.java
   ```
3. Run the Java program:
   ```sh
   java NumberContainers
   ```

---

## 📌 Constraints

- \(1 \leq \text{index}, \text{number} \leq 10^9\)
- At most **10⁵** calls will be made in total to `change` and `find`.

---

## 🔥 Features

✅ Efficient updates using **TreeSet**  
✅ Handles large index and number values  
✅ Fast lookups for the smallest index  

---

## 🏆 Author

👤 **Dhiraj Kumar**  
📧 Email: dhiraj7kr@gmail.com  
💻 GitHub: [@dhiraj7kr](https://github.com/dhiraj7kr)

---

## 🌟 Support

