### **HashMap in Java (Beginner's Guide)**
A **HashMap** in Java is part of the `java.util` package and is used to store **key-value pairs**. It allows efficient insertion, deletion, and lookup operations.

---

### **Features of HashMap**
1. **Stores key-value pairs** (like a dictionary in Python).
2. **Allows one null key** and multiple null values.
3. **Unordered Collection** – It does not maintain any order of elements.
4. **Fast performance** – Provides `O(1)` time complexity for insertion, deletion, and retrieval (on average).
5. **Duplicates not allowed** – Keys must be unique; values can be duplicate.

---

### **Basic Syntax of HashMap**
```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements (put method)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Accessing elements (get method)
        System.out.println("Value for key 2: " + map.get(2)); // Output: Banana

        // Removing an element
        map.remove(3);

        // Checking if a key exists
        System.out.println("Contains key 3? " + map.containsKey(3)); // Output: false

        // Iterating over HashMap
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
```

---

### **Common Methods of HashMap**
| Method | Description |
|--------|------------|
| `put(K key, V value)` | Adds a key-value pair |
| `get(K key)` | Returns the value associated with the key |
| `remove(K key)` | Removes a key-value pair |
| `containsKey(K key)` | Checks if a key exists |
| `containsValue(V value)` | Checks if a value exists |
| `size()` | Returns the number of key-value pairs |
| `keySet()` | Returns a set of all keys |
| `values()` | Returns a collection of all values |
| `entrySet()` | Returns a set of key-value pairs |

---

### **Practice Question**
#### **Question 1: Count the frequency of characters in a string using HashMap**
**Problem Statement:**  
Write a Java program that takes a string input and counts the occurrences of each character using `HashMap`.

#### **Solution**
```java
import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "java hashmap example";

        HashMap<Character, Integer> charCount = new HashMap<>();

        // Loop through each character
        for (char ch : str.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the frequency of each character
        for (char key : charCount.keySet()) {
            System.out.println("Character: " + key + ", Count: " + charCount.get(key));
        }
    }
}
```
**Output:**
```
Character: j, Count: 1
Character: a, Count: 4
Character: v, Count: 1
Character: h, Count: 2
Character: s, Count: 1
Character: m, Count: 2
Character: p, Count: 1
Character: x, Count: 1
Character: e, Count: 2
Character: l, Count: 1
```

---

### **Conclusion**
- `HashMap` is a powerful data structure that allows **fast lookups and insertions**.
- It is widely used for problems like **caching, frequency counting, and data mapping**.
- The **key must be unique**, and the values can be duplicated.

Would you like more practice problems? 🚀
