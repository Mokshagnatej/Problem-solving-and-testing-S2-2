# 🚀 Week 2: Core Data Structures & Algorithms

Welcome to **Week 2** of the Problem Solving and Testing journey! This week is heavily focused on strengthening foundational algorithmic skills using **Java**, diving deep into Arrays, Hash Maps, Prefix Sums, Deques, and classic optimization techniques.

---

## 🎯 Learning Objectives & Impact

- **Two-Pointer Techniques:** Mastered optimizing space complexity to $O(1)$ by manipulating arrays in-place (e.g., removing elements and duplicates).
- **Prefix Sums:** Learned to precompute running totals to answer accumulation queries in $O(1)$ time, optimizing array traversal operations.
- **Hashing & Maps:** Utilized `HashMap` for $O(1)$ lookups, enabling efficient grouping (Anagrams) and frequency counting (Top K Elements).
- **Kadane's Algorithm:** Grasped dynamic programming for contiguous subarray problems, reducing $O(N^2)$ brute-force solutions to an elegant $O(N)$ approach.
- **Priority Queues (Heaps):** Handled top-K elements efficiently without the overhead of sorting the entire dataset.
- **Sliding Window with Deque:** Used `ArrayDeque` with `HashSet` to efficiently process contiguous sliding windows and determine maximum unique elements.

---

## 💻 Problems Solved & Java Implementation

| Problem | Platform | Difficulty | Core Concept / Algorithm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🔄 **[Group Anagrams](./group-anagrams/)** | LeetCode | 🟡 Medium | Hash Maps, String Sorting | $O(N \cdot K \log K)$ | $O(N \cdot K)$ | [Java](./group-anagrams/solution.java) |
| 📈 **[Maximum Subarray](./maximum-subarray/)** | LeetCode | 🟡 Medium | Kadane's Algorithm (DP) | $O(N)$ | $O(1)$ | [Java](./maximum-subarray/solution.java) |
| 🧹 **[Remove Duplicates from Sorted Array](./remove-duplicates-from-sorted-array/)** | LeetCode | 🟢 Easy | Two Pointers (In-place) | $O(N)$ | $O(1)$ | [Java](./remove-duplicates-from-sorted-array/solution.java) |
| 🗑️ **[Remove Element](./remove-element/)** | LeetCode | 🟢 Easy | Two Pointers (In-place) | $O(N)$ | $O(1)$ | [Java](./remove-element/solution.java) |
| ➕ **[Running Sum of 1d Array](./running-sum-of-1d-array/)** | LeetCode | 🟢 Easy | Prefix Sum | $O(N)$ | $O(1)$ | [Java](./running-sum-of-1d-array/solution.java) |
| 🏔️ **[Find the Highest Altitude](./find-the-highest-altitude/)** | LeetCode | 🟢 Easy | Prefix Sum | $O(N)$ | $O(1)$ | [Java](./find-the-highest-altitude/solution.java) |
| 🔀 **[Shuffle the Array](./shuffle-the-array/)** | LeetCode | 🟢 Easy | Array Manipulation | $O(N)$ | $O(N)$ | [Java](./shuffle-the-array/solution.java) |
| 🔝 **[Top K Frequent Elements](./top-k-frequent-elements/)** | LeetCode | 🟡 Medium | `HashMap`, `PriorityQueue` (Min-Heap) | $O(N \log K)$ | $O(N)$ | [Java](./top-k-frequent-elements/solution.java) |
| 📦 **[Java Dequeue](./java-dequeue/)** | HackerRank | 🟡 Medium | Sliding Window, `ArrayDeque` & `HashSet` | $O(N)$ | $O(M)$ | [Java](./java-dequeue/solution.java) |

*(Note: $N$ is the number of elements in the array/collection, $K$ is the length of strings or target frequency, $M$ is the window size)*

---

## 🛠️ Tech Stack & Best Practices
- **Language:** Java ☕
- **Focus:** 
  - Strict Time and Space Complexity Analysis.
  - Writing clean, readable, and well-structured code.
  - Handling edge cases effectively (empty arrays, negative numbers, duplicates).

---

<div align="center">

*Week 2 completed successfully!*

</div>