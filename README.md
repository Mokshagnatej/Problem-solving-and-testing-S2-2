<div align="center">

# 🧠 Problem Solving and Testing (S2-2)

*A structured journey through algorithms, data structures, and technical testing using Java.*

![Total Solved](https://img.shields.io/badge/Total_Solved-26-blue?style=for-the-badge)
![Streak](https://img.shields.io/badge/Streak-Active-orange?style=for-the-badge)
![Language](https://img.shields.io/badge/Language-Java-red?style=for-the-badge)

</div>

---

## ⚡ Quick Revision Index

Before an interview, jump straight to a technique to see how it's implemented:

- **Array Manipulation**: [Richest Customer Wealth](#richest-customer-wealth), [Shuffle the Array](#shuffle-the-array), [Java Arraylist](#java-arraylist)
- **Custom Comparator**: [Java Comparator (W1)](#java-comparator), [Java Sort (W1)](#java-sort), [Java Comparator (W3)](#java-comparator-w3), [Java Sort (W3)](#java-sort-w3)
- **Dynamic Arrays**: [Java Arraylist](#java-arraylist)
- **Functional Interfaces**: [Java Lambda Expressions](#java-lambda-expressions)
- **HashMap / Bucket Sort**: [Group Anagrams](#group-anagrams), [Top K Frequent Elements](#top-k-frequent-elements)
- **Java Date API**: [Day of the Week](#day-of-the-week), [Java Date and Time](#java-date-and-time), [Days Between Two Dates](#number-of-days-between-two-dates), [Day of the Year](#day-of-the-year)
- **Kadane's Algorithm**: [Maximum Subarray](#maximum-subarray)
- **Prefix Sum**: [Find Pivot Index](#find-pivot-index), [Running Sum of 1d Array](#running-sum-of-1d-array), [Find the Highest Altitude](#find-the-highest-altitude)
- **Priority Queue (Heap)**: [Java Priority Queue](#java-priority-queue)
- **Sliding Window**: [Java Dequeue](#java-dequeue)
- **Two-pointer**: [Squares of a Sorted Array](#squares-of-a-sorted-array), [Remove Duplicates](#remove-duplicates-from-sorted-array), [Remove Element](#remove-element)

---

## 📅 Weekly Progress & Focus Areas

This repository tracks my ongoing progress in mastering algorithmic thinking and Java programming. Each week is dedicated to specific concepts, incrementally building robust problem-solving skills through challenges on platforms like LeetCode and HackerRank.

### [🚀 Week 1: Foundations & Arrays](./Week-1)
- **Focus:** Algorithmic foundations, core Java features, and array manipulation.
- **Key Concepts:** Prefix Sum Arrays, Two-Pointer Techniques, Java 8 Lambda Expressions, and Custom Comparators.
- **Highlights:** Transitioned from $O(N^2)$ brute-force logic to optimal $O(N)$ solutions using Prefix Sums for range queries.

| Problem | Core Technique | Complexity (T/S) | Why this approach? | Difficulty |
|---|---|---|---|---|
| <a id="richest-customer-wealth"></a>[Richest Customer Wealth](./Week-1/richest-customer-wealth) | Array Manipulation | $O(N \times M)$ / $O(1)$ | Simple linear scan tracks max running sum. | 🟢 Easy |
| <a id="java-comparator"></a>[Java Comparator](./Week-1/java-comparator) | Custom Comparator | $O(N \log N)$ / $O(1)$ | Overrides `compare()` to sort by score, then name. | 🟢 Easy |
| <a id="java-sort"></a>[Java Sort](./Week-1/java-sort) | Custom Comparator | $O(N \log N)$ / $O(N)$ | Multi-tier priority sorting for objects. | 🟡 Medium |
| <a id="find-pivot-index"></a>[Find Pivot Index](./Week-1/find-pivot-index) | Prefix Sum | $O(N)$ / $O(1)$ | Track running left sum and compare against pre-calculated total sum. | 🟢 Easy |
| <a id="java-lambda-expressions"></a>[Java Lambda Expressions](./Week-1/java-lambda-expressions) | Functional Interfaces | $O(\sqrt{N})$ / $O(1)$ | Encapsulate math behaviors in anonymous interface implementations. | 🟡 Medium |
| <a id="squares-of-a-sorted-array"></a>[Squares of a Sorted Array](./Week-1/squares-of-a-sorted-array) | Two-pointer | $O(N)$ / $O(N)$ | Largest squares are always at the boundaries, merging inwards. | 🟢 Easy |

### [🧮 Week 2: Core Data Structures & Optimization](./Week-2)
- **Focus:** Strengthening algorithms and leveraging essential Java data structures.
- **Key Concepts:** Hash Maps, Priority Queues (Heaps), Kadane's Algorithm (Dynamic Programming), and In-place Array manipulation.
- **Highlights:** Achieved $O(1)$ space optimization and implemented efficient grouping and frequency counting using Hash Maps and Heaps.

| Problem | Core Technique | Complexity (T/S) | Why this approach? | Difficulty |
|---|---|---|---|---|
| <a id="remove-duplicates-from-sorted-array"></a>[Remove Duplicates](./Week-2/remove-duplicates-from-sorted-array) | Two-pointer (In-place) | $O(N)$ / $O(1)$ | Slow pointer tracks unique elements, fast skips duplicates. | 🟢 Easy |
| <a id="shuffle-the-array"></a>[Shuffle the Array](./Week-2/shuffle-the-array) | Array Manipulation | $O(N)$ / $O(N)$ | Simple loop taking `i` and `n+i` elements alternately. | 🟢 Easy |
| <a id="java-dequeue"></a>[Java Dequeue](./Week-2/java-dequeue) | Sliding Window / HashSet | $O(N)$ / $O(M)$ | Deque manages window bounds, HashSet enables O(1) unique checks. | 🟡 Medium |
| <a id="top-k-frequent-elements"></a>[Top K Frequent Elements](./Week-2/top-k-frequent-elements) | HashMap / Bucket Sort | $O(N)$ / $O(N)$ | Frequency is bounded by N, bucket sort avoids O(N log K) heap. | 🟡 Medium |
| <a id="running-sum-of-1d-array"></a>[Running Sum of 1d Array](./Week-2/running-sum-of-1d-array) | Prefix Sum | $O(N)$ / $O(1)$ | Reusing array to store cumulative sums saves space. | 🟢 Easy |
| <a id="remove-element"></a>[Remove Element](./Week-2/remove-element) | Two-pointer (In-place) | $O(N)$ / $O(1)$ | Swapping valid elements to the front skips target value. | 🟢 Easy |
| <a id="find-the-highest-altitude"></a>[Find the Highest Altitude](./Week-2/find-the-highest-altitude) | Brute-force Prefix Sum | $O(N^2)$ / $O(1)$ | Calculates cumulative sum from scratch at each step. | 🟢 Easy |
| <a id="maximum-subarray"></a>[Maximum Subarray](./Week-2/maximum-subarray) | Kadane's Algorithm | $O(N)$ / $O(1)$ | Reset running sum if negative, as it drags down future subarrays. | 🟡 Medium |
| <a id="group-anagrams"></a>[Group Anagrams](./Week-2/group-anagrams) | HashMap / Sorting | $O(N \cdot K \log K)$ / $O(N \cdot K)$ | Sorted string serves as canonical key for anagram groups. | 🟡 Medium |

### [🕰️ Week 3: Java Utilities & Advanced Collections](./Week-3)
- **Focus:** Mastering essential built-in Java utilities, dynamic collections, and date/time processing.
- **Key Concepts:** Java Date and Time API (`java.time.LocalDate`), Dynamic Multidimensional Arrays (`ArrayList`), `PriorityQueue`, and advanced Sorting (`Collections.sort()`).
- **Highlights:** Replaced manual date arithmetic with robust modern APIs and managed dynamic, prioritized data streams effectively.

| Problem | Core Technique | Complexity (T/S) | Why this approach? | Difficulty |
|---|---|---|---|---|
| <a id="day-of-the-week"></a>[Day of the Week](./Week-3/day-of-the-week) | Java Date API | $O(1)$ / $O(1)$ | Leverage `LocalDate` instead of manual calendar math. | 🟢 Easy |
| <a id="java-date-and-time"></a>[Java Date and Time](./Week-3/java-date-and-time) | Java Date API | $O(1)$ / $O(1)$ | Use `Calendar` API to reliably resolve week day index. | 🟢 Easy |
| <a id="java-arraylist"></a>[Java Arraylist](./Week-3/java-arraylist) | Dynamic Arrays | $O(N)$ / $O(N)$ | Jagged 2D arrays handle variable length rows efficiently. | 🟢 Easy |
| <a id="number-of-days-between-two-dates"></a>[Days Between Two Dates](./Week-3/number-of-days-between-two-dates) | Math / Date Parsing | $O(1)$ / $O(1)$ | Normalize date comparisons by calculating days since 1900. | 🟢 Easy |
| <a id="java-comparator-w3"></a>[Java Comparator](./Week-3/java-comparator) | Custom Comparator | $O(N \log N)$ / $O(1)$ | Overrides `compare()` to sort by score, then name. | 🟢 Easy |
| <a id="java-sort-w3"></a>[Java Sort](./Week-3/java-sort) | Custom Comparator | $O(N \log N)$ / $O(N)$ | Multi-tier priority sorting for objects. | 🟡 Medium |
| <a id="java-priority-queue"></a>[Java Priority Queue](./Week-3/java-priority-queue) | Priority Queue (Heap) | $O(N \log N)$ / $O(N)$ | Maintains dynamic priority order for incoming and served events. | 🟡 Medium |
| <a id="day-of-the-year"></a>[Day of the Year](./Week-3/day-of-the-year) | Math / Date Parsing | $O(1)$ / $O(1)$ | Accumulate days of preceding months and add leap year logic. | 🟢 Easy |

---

## 📊 Overall Statistics

| Difficulty | Solved |
|:---:|:---:|
| 🟢 Easy | **12** |
| 🟡 Medium | **14** |
| 🔴 Hard | **0** |
| **Total** | **26** |

## 🛠️ Tech Stack & Methodology

| Language | Total Solutions | Focus Areas |
|:---:|:---:|:---|
| Java ☕ | **26** | Time/Space Complexity Analysis, Clean Architecture, Edge Case Management |

## 📂 Repository Structure

```text
📦 Problem-solving-and-testing-S2-2/
├── 📁 Week-1/
│   ├── (Prefix Sums, Two-Pointers, Lambdas)
├── 📁 Week-2/
│   ├── (Hash Maps, DP, Heaps, In-place Arrays)
└── 📁 Week-3/
    ├── (Date/Time APIs, Collections, PriorityQueues)
```

---

<div align="center">

*"Consistency is the key to mastering algorithms. Every problem solved is a new pattern recognized."*

</div>